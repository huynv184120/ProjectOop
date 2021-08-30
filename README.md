# OOP Project

##A. Introduction
This is a great object-oriented exercise. 

**I. Description :**
Each camera has a limited field of view (by the camera's viewing angle and its range) as well as in the room (which contains the camera) there are objects blocking the view of the camera.
![image](https://user-images.githubusercontent.com/48614539/120887325-5016fd80-c61c-11eb-84f5-e54f77e3557d.png)

In this situation, the following problems arise:

- Calculate the hidden areas of a camera when given information about camera placement (in 3D space), high angle and wide angle of the camera. This hidden area still takes into account locations that are in view of the camera but are hidden by other objects. This problem can be extended to having multiple cameras inside the room 
-Given a given camera, determine how many more cameras (and where) need to be placed at least so that there are no hidden corners. 
-With the number of cameras blocked above, determine the camera positions so that the area (volume is more correct) of the hidden corner is the smallest. 

**II. Hypothesis to simplify the problem **

We have the following assumptions to simplify the problem:

- The room is always a rectangular box and has sides parallel to the coordinate axis
- The camera does not rotate automatically (once it is mounted on the wall, it cannot be moved)
- The objects in the room are always rectangular and always placed vertically (ie perpendicular to the floor).
- The room is always bright enough
- Objects are always fixed
- Camera is only placed perpendicular to the wall
- Insignificant camera size, treat it as a wall or ceiling mounting point

![image](https://user-images.githubusercontent.com/48614539/120887346-6cb33580-c61c-11eb-86bb-d6eb41c0ac29.png)

**III.  Input file format: **

 **Input:**
 
- The first line is the coordinates of 8 points (x, y, z) of the rectangular box representing the room
  - A point is at the origin (0, 0, 0)
  - Positive values
  - Sides parallel to origin
  - The points are separated by a space
  - Values ​​x, y, z are separated by commas
  - Values ​​x, y, z are in parentheses
- The next line is the natural number n (n >= 0) is the number of objects in the room
  - Next N lines, each line is 8 points representing the rectangular box of the object (similar format as above)
  - Objects do not intersect and do not intersect with the planes of the room walls
- The next line is the natural number m (m >= 0) is the number of cameras in the room
  - The next M lines each are the camera coordinates, camera wide angle, camera height
  - The camera is always on the wall and is perpendicular to the wall
  - The visible area of ​​the camera is a rectangular pyramid
  - The angle of rotation of the camera with the bottom (is a rectangle parallel to the coordinate axes)
  - Wide angle and high angle are the angles between two lateral planes of the pyramid 

**IV. Functions:**
The program has the following functions: 

- **Room setting function :** The user reads from the file the size of the room, the coordinates of the objects in the room (because the object is rectangular, so just enter the coordinates of the two opposite vertices of the HCN in contact with the floor, the length of one side of the HCN there, cum the height of the object), the color of the object. The program will have to check the validity of: object size (must be rectangular), object placement (more specifically all objects must be in the room), if the object is not in contact with the floor then it must be on another object. 

- **Camera placement function :**The user reads from the file into the coordinates of the camera, high angle, wide angle camera. The program must check if the camera's coordinates are in the room (and on the wall or on the ceiling), the camera's viewing angle must be less than 90 degrees, the distance is less than 100m. 

- **Hidden area calculation function :**The program must calculate whether any point in the room will belong to which group of objects? More specifically, it can be of the type: 
  - Points belonging to the object (in the heart or on the surface)
   - Points that do not belong to the object and are in the viewable area of a certain camera (if the room has more than one camera)
   - The point is not on the object and is not in the viewable area of any camera

- **Function to display hidden areas:** 

The program displays five projections of the hidden areas in the room, the hidden areas will be black. Five projections correspond to 5 different views into the room: top down, left to right, right to left, front to back, back to front.

- **Function to determine how many more cameras need to be placed at least (and where) so that there are no hidden corners**

- **Function to determine camera positions so that the area (volume is more correct) the hidden corner is the smallest**


## B. Interface
### I. Application interface 

![191778538_932930043947053_4227792987921249349_n](https://user-images.githubusercontent.com/48614539/120886396-eb59a400-c617-11eb-965e-9aeed82c539c.png)

### II. Read File function screen
![192650981_1954896618001185_641201620609894395_n](https://user-images.githubusercontent.com/48614539/120886447-2c51b880-c618-11eb-8a43-1eff085f7323.png)

- Here you choose the path to the .txt file which is the program's input file

- After selecting the input file, you will be able to perform the functions below

### III. Check a Point function screen 

![191097420_323110452714765_4812169849986742422_n](https://user-images.githubusercontent.com/48614539/120886510-94a09a00-c618-11eb-919b-c1acbca7bfc3.png)

- Here you enter the coordinates of a point and check whether that point is light or dark

- The screen will notify like this 

![197288236_314634740280999_2687355317616238590_n](https://user-images.githubusercontent.com/48614539/120886639-290afc80-c619-11eb-839e-1dd63e1ece40.png)


### IV. Function Caculate The Hidden Area

- Calculate the percentage of the area seen by the camera in the room 

![193779727_356318105843196_6894552735816920153_n](https://user-images.githubusercontent.com/48614539/120886680-4dff6f80-c619-11eb-8656-52314be799cc.png)

### V. Display The Hidden Area function

- Displays a projection of the visible area on all sides of the room except the top

![188804818_1035917173814425_7102112656160449139_n](https://user-images.githubusercontent.com/48614539/120886748-b77f7e00-c619-11eb-871b-4bdff47087fc.png)

### VI. Function Display The Vision Of Camera

- Display the image that the camera sees in the room

![189229766_580671316244362_5907220608318739434_n](https://user-images.githubusercontent.com/48614539/120886776-de3db480-c619-11eb-8f0e-3d3ee5be6b54.png)

### VII. The rest of the functions
- *Exit* function to exit the program
- The rest of the functions are still in development  
