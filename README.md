[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/Q70zc3t9)
# JavaFinalProgramSpr23

My file is refactored version of my zooPopulation midterm file. Meaning I have not changed really any major code structers however I did refactor to add classes and linked lists in consideration of our OOP learning.

My code begins with a few declarations. Two of my orignal functions remain as they turned out to be effective solutions. from there I move into my main. I create two classes for docs and each animal followed by linked listst serving as the Habitats. 

My original code used buffered readers and scanners to parse strings and ints from the specified files "animalNames.txt" and "arrivingAnimals.Txt". I have changed this to use file Scanners. In the original midterm the aurthorized solution allowed some levity in putting the animalNames file in as a typed array. I solved the problem and was able to read in both via a scanner and parse it down to a split arrays. I parse two arrays for "hyenaHabitat", "lionHabitat", etc and a seperate array for the names respectively the resuting arrays were placed in another class for all strings as strings.habs,  strings.hyenas, strings.lions, etc. This was a solution to the problem of reading the file in as a string array and then parsing it down to the two arrays. From there I introduce the program. I have also added a method to print the animals in the Habitats later which is where my code refactor comes into play.

Following the scanners with a filewriter all my data is written to a file called "zooHabitats.txt". After beggining my file writer I declare classes for dates, all integers, and all strings. The arrays are then used to create a linked list for each habitat. The animal class is then used to create an animal object for each animal in the habitat found via the linked lists. The animal object is then used to print out the animal name through the habitat it is in. This is done for each animal in each habitat.

All text from animalnames was split in a 49 or so index array. which then went to a grouping of four for loops which split the names in the arrays for each selection of animalNames as strings.Hyenas, Strings. Lions.etc.

Then another for loop was used to split the arrivingAnimalsarray created result from my scanner which I did not alter from my midterm file too far. The only changes were the locations and references for each element parsed from the array after the file scan which would be found in class integers, class strings, or class dates.

Originally all parsed data were from strings that were printed out in a specified format after splitting the original files in as various strings and parsed integers. In my refactor I place all possible strings into a class and all possible intgers into another class. To conceptualize my goal i initally declared a Class for each individual animal and the associated data was created as a blueprint. I then put those various strings together in an Animal Object for each animal. After each element could be referenced in through Animal object class a linked list was used for each Habitat and each corresponding animal object was than linked to the corresponding habitat via the linkedlists. Thus satisfying the OOP requirements for the assignment as all elements are printed from the Animal object class and the linked lists.

Additonal Comments:
Much of my code is trial and error as I am not an expert in Java in the least. When I conceptually knew what to do I noticed I didn'st have the practice to recall exact syntax at time to properly let my code declare, intialize, and calls itself. Much was of my code was the result of exentsive research and essential reverse engineering to gather what the vairous elements can do. Some of the under the hood functinality of certain methods meant I needed help to understand how to use those properly and often solutions were as simple as adding another line with the proper syntax to get the result I needed. Meaning for me my code could be perfect save for the one element I needed but I would be left for hours without an idea of what to do.

Some noted errors include strings.habs which doesn't actually contain the Habitat names for what ever reason. So instead I simply printed each Habitat Name before having a for loop print out each Animal object in my linkedlist for each habitat.

Along with extensive research I also used ChatGpt to help me refactor when code was repititious. So when I needed code copied but refactored for each habitat I would ask chat GPT to assist in recopying the code but for each habitat element. I am confident however the code is all mine. How I know this is because Chat GPT kept trying to refactor my code to send scanner elements strait to my linked lists. Given the redundency and certain levels of efficiency in my code which could be better I know the code is all mine plain and simple.