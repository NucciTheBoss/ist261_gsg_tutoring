package utils;

import shape.Shape;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

/**
 * @author Jason C. Nucciarone
 * @version 1.0
 * @since 2021-11-3
 */
public class SerialDeserial {
    public static void serial(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            try {
                String fileName = "C:\\Users\\jason\\OneDrive\\Desktop\\ist261_gsg_tutoring\\session_3\\solution\\serial_shapes_sol\\src\\main\\java\\utils\\tmp\\"
                        + shape.getUniqueID() + ".ser";
                File testFile = new File(fileName);

                // Check if files still exist
                if (testFile.isFile()) {
                    testFile.delete();
                }

                testFile.createNewFile();
                FileOutputStream file = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(shape);
                out.close();
                file.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<Shape> deserial() {
        try {
            // Set path for reading in serialized files
            Path dir =
                    Paths.get("C:\\Users\\jason\\OneDrive\\Desktop\\ist261_gsg_tutoring\\session_3\\solution\\serial_shapes_sol\\src\\main\\java\\utils\\tmp");

            // Glob up all available serial files in tmp
            DirectoryStream<Path> stream = Files.newDirectoryStream(
                    dir, "*.ser"
            );

            // Read shapes back into memory
            ArrayList<Shape> shapeList = new ArrayList<>();

            for (Path path : stream) {
                FileInputStream file = new FileInputStream(path.toString());
                ObjectInputStream in = new ObjectInputStream(file);
                shapeList.add((Shape) in.readObject());
                in.close();
                file.close();

                // Clean out the old files
                path.toFile().delete();
            }

            // Return shapeList to controller
            return shapeList;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
