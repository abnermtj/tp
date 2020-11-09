

  

<h1 align="center">  CheatLogs User Guide </h1>


![Our Logo](https://i.ibb.co/VxzKbbz/a1.png)

CheatLogs is a free and open-source cheatsheet manager with blazing fast organization, editing and searching via both a command-line interface (CLI) and a graphical user interface (GUI) .

This user guide serves as a reference for using the features of CheatLogs. The level of technicality within this document is tailored towards our target audience, novice programmers. If you are new, we recommend reading this from the very [start](#before-start).

The table of contents below lets you easily access the documentation for installation, specific features, and frequently asked questions. 

> <font size = "5" >:bulb: Here are some patterns you will come across and their meanings.
> ------
>|Pattern|Meaning  |
>|--|--|
>| :bulb: |Tip on current section  |
>|:exclamation:|Warning of potential error|
>|:memo:|Important details to note|
>|<font size="3"> [:arrow_up_small:](#table-of-contents)</font>| Returns to table of contents on left click|
>|**bold**|Key terms specific to CheatLogs|
>|*italics*|Files|
>|`Snippets`|Typed input or output going into or out of CheatLogs|

> :exclamation: Colour of images in this document may not be exactly the same as what you see in your terminal due to syntax highlighting of the imaging software used.

<br>

# Table of contents

* [1. Before you start](#before-start)
* [2. Running CheatLogs](#start)
* [3. GUI text editor](#editor)
* [4. Commands](#commands)
   * [4.1. Storage commands (Aldo)](#storage-command-type)
   	  * [4.1.1. Adding a cheatsheet: `/add`](#add-command)
   	    * [4.1.1.1. Adding a cheatsheet using the easy mode](#add-command-easy)
   	    * [4.1.1.2. Adding a cheatsheet using the advanced mode](#add-command-advanced)
	  * [4.1.2. Deleting a cheatsheet: `/delete`](#delete-command)
	    * [4.1.2.1. Deleting a cheatsheet using the easy mode](#delete-command-easy)
            * [4.1.2.2. Deleting a cheatsheet using the advanced mode](delete-command-advanced)
	  * [4.1.3. Clearing all entries: `/clear`](#clear-command)
  * [4.2.  Manipulation commands (Abner)](#manipulation-command-type)
	  * [4.2.1. Editing a cheatsheet: `/edit` ](#edit-command)
	  * [4.2.2. Favouriting a cheatsheet: `/fav` ](#favourite-command)
  * [4.3.  Viewing commands (Brandon)](#viewing-command-type)
	 * [4.3.1. Locating a cheatsheet by name: `/find`](#find-command)
	 * [4.3.2. Viewing the cheatsheet: `/view`](#view-command)
	 * [4.3.3. Listing all cheatsheets: `/list`](#list-command)
  * [4.4.  General commands (Adhy)](#general-command-type)
	 * [4.4.1. Viewing help: `/help`](#help-command)
	 * [4.4.2. Change program settings: `/set`](#settings-command)
	    * [4.4.2.1 Change color scheme](#settings-color)
	    * [4.4.2.2 Change behavior of help message](#settings-help-message)
	 * [4.4.3. Exiting the program: `/exit`](#exit-command)
* [5. Data storage (Theo)](#data-storage)
  * [5.1. Data file contents](#data-file-contents)
	  * [5.1.1. XML file configurations](#xml-file-configurations)  
	  * [5.1.2. Main](#main) 	
	  * [5.1.3. Favourite](#favourite) 
	  * [5.1.4. Subject](#subject) 
	  * [5.1.5. Contents](#contents) 	
  * [5.2. Data file organization](#data-file-organization)
  * [5.3. Preloaded data files](#preloaded-data-files)  	     	    	  	    
* [6. FAQ](#faq)
* [7. Command Cheatsheet](#command-cheatsheet)

<br>

<a id="before-start"></a>
#  1. Before you start<font size="5"> [:arrow_up_small:](#table-of-contents)</font>
CheatLogs requires Java 11 or above installed on your computer. You can follow the the following instructions to install Java 11:
> &nbsp;:exclamation: If you use earlier versions of Java, there may be compatibility issues. Thus, we recommend using the same one we developed on, Java 11. 
> 
 1. Download Java JDK 11 for your system from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
 2. Run and follow the installation instruction in the wizard.
 3. Check your Java version.
	 * For computers on Windows, invoke`java -version` on the command prompt.
	 * For MacOS or Linux distros, invoke `java -version` on your terminal of choice.
4. Verify that the version installed follows the "11.x.x" format. Refer to the image below for what you should expect to see.

![Java 11 installed message](https://i.ibb.co/tzV9GX3/image.png)

<br>

<a id="start"></a>
#  2. Running CheatLogs<font size="5"> [:arrow_up_small:](#table-of-contents)</font>
CheatLogs is easy to get running. You can follow the  steps below to do so.
1.  You can download the latest version of CheatLogs from [here](https://github.com/AY2021S1-CS2113T-W11-3/tp/releases).
2. Scroll to the latest release.
3. Download only the *CheatLogs.jar* file highlighted in the orange box below.

	![](https://i.ibb.co/C24vhGg/image.png)
4. Create a new directory anywhere on your PC, This is the home folder where CheatLogs will be creating its own subdirectories to store cheatsheets. 

> :bulb: Unfamiliar with navigating the terminal? Click [here](https://www.digitaltrends.com/computing/how-to-use-command-prompt/) for a basic introduction for Windows cmd and [here](https://www.pluralsight.com/guides/beginner-linux-navigation-manual) for macOS/Linux bash terminal.

5. Move *CheatLogs.jar* to the new directory.
6. On the terminal,  navigate to the directory.
> :memo:  If you are running CheatLogs for the first time, proceed to step 7.1. Otherwise, proceed to step 7.2.

7. 
    1. Invoke `java -jar cheatlogs.jar first` to run the program. Through this command, CheatLogs will import [preloaded
cheatsheet files](#preloaded-data-files) for you to use.
    
    2. Invoke `java -jar cheatlogs.jar` to run the program. 

> :exclamation: If a welcome message appears as shown below after running step 7.1 or 7.2, then great! CheatLogs is up and running.

![CheatLogs welcome screen]( https://i.ibb.co/L6LmYGZ/mainMenu.png)

8. Try typing some commands in the terminal and hit Enter to execute.
   Here are some example commands you can try, don't worry if you don't know them yet!
   
   * `/help`: Shows help info on how to use the application.
   * `/list`: Lists all cheatsheets.
   * `/exit`: Exits the app.

A bit confused? Here is a video guide on doing steps 4-9 using the terminal (not cmd). Note that CheatLogs.jar already been placed in the Desktop folder.
> :bulb: The commands for Windows cmd and UNIX/MacOS terminal are quite similar. You can achieve the same result with cmd using the exact same commands used in the following video.

> :exclamation: This demonstration follows step 8b instead of step 8a.

![ezgif-6-63beb94eab4e](https://i.ibb.co/Q9FShJt/ezgif-6-63beb94eab4e.gif)
 <br>
 
<a id="editor"></a>
#  3. GUI text editor<font size="5"> [:arrow_up_small:](#table-of-contents)</font>
CheatLogs provides a simple graphical user interface (GUI) text editor that automatically pops up on certain commands. These commands include: `/add` and `/edit`. This allows you to have an easier time manipulating data, performing simple operations such as cut, copy and paste or even using your mouse which are typically unavailable on the CLI. Below is what you can expect to see and be able to do when it pops up.
<p align="center">
   <img width="500" height="350" src="https://i.ibb.co/3kZ7Xjq/cheatlogs-editor.gif">
</p>

There are two main group of functions that can be used in out Graphical User Interface. 

Actions tab - Actions that relates to the cheatsheet files
 - Save : Saves the text inputted, then exits the text editor.
 - Clear All : Removes all text in the text editor, remains in the text editor.
 - Cancel : Removes all text and exit the text editor without saving.

Edit tab - Actions to manipulate the contents
  - Copy : Copies the text highlighted in the editor to the system clipboard.
 -  Cut : Cuts the text highlighted in the editor to the system clipboard.
 -  Paste : Pastes from the system clipboard to the position of the text cursor.

> :bulb: The editor has a built-in feature to prevent blank cheatsheets from being saved.

In the following sections, we will be referring to this editor as **the Editor**. 
 
<a id="commands"></a>
# 4. Commands<font size="5"> [:arrow_up_small:](#table-of-contents)</font>
Commands are how you interact with Cheatlogs. To understand the terminology being used in the later sections, we would like you to understand the typical structure of a command, illustrated below.

<p align="center">
   <img width="540" height="390" src="https://i.ibb.co/r3JjNZs/Sprite-0005.png">
</p>

The anatomy of the command is broken down to color coded sections in the picture. These elements are used to execute the command and are elaborated below:
 * **Command identifier**: Every command needs one. It is used to determine exactly what type of command needs to be run. In the commmand above, `/add` is the command identifier for adding cheatsheets.

 * **Flag**: Akin to options or parameters of the command, these are additional information passed to CheatLogs to use. Flags are sometimes optional and you don't always need to type them. In the command above, `/n`  and `/s` are used to indicate the names and subject of the cheatsheet respectively with `/s` being an optional flag.
	
	There are several types of flags that is used in the command structure of CheatLogs, that includes:
	 * Optional: Flag does not need to be included
	 * Necessary: Flag must be included
	 * At least one: At least one of the a set of flags must be included

* **Flag description**: Used when the flag itself does not provide enough information, CheatLogs takes in additional information for each flag through that flag's description. Not all flags have flag descriptions but each flag description needs to accompany a flag. In the command above, it is the name flag `n` is described by `help` and the subject flag `s` is described by `me`.

> :bulb: You need not worry if you forget the exact flags for each command. CheatLogs prompts you to enter the flag description for each missing necessary flags. <br>
> :exclamation: CheatLogs is case-sensitive, be sure to match the case for flags about names.

<br>

<a id="storage-command-type"></a>
## 4.1. Storage Commands:  <font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
This is one of the most used command type in CheatLogs.
They allow you to manage the input and output of cheatsheets to and from the entire list of cheatsheets. 
CheatLogs only has one list of cheatsheets and the following storage commands all refer to this as **the List**.
___

<a id="add-command"></a> 
### 4.1.1. Adding a cheatsheet: `/add` <font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

> :exclamation: The subject name would be automatically converted to pascal case, no matter whether the input by user is in lower or upper case.
> Example: 
> * `java` would be converted to `Java`
> * `PYTHON` would be converted to `Python`
> * `ruby on rails` would be converted to `RubyOnRails`

You can easily use the `/add` command to add your own cheatsheets to the list.
You can use the two available modes for adding the cheatsheet: **easy** and **advanced** mode.

<a id="add-command-easy"></a>
#### 4.1.1.1. Adding a cheatsheet using the easy mode<font size="5"> [:arrow_up_small:](#table-of-contents)</font>
> Format: `/add`

The first method that you can use to add cheatsheet is the easy mode. Just type `/add` without adding any flag or description. 
You will be prompted to fill in the `NAME` and the `SUBJECT` of your cheatsheet.
![image](https://i.ibb.co/n01kQ4Y/carbon.png)

Shortly after, a window will pop up to show the editing window.
Enter the details of your cheatsheet in the text area shown bellow:
![image](https://i.ibb.co/hYtY1GM/Screenshot-2020-11-09-at-6-30-12-PM.png)

Once you are done with entering the details, click the`Save` button to save the cheatsheet.

![image](https://i.ibb.co/n01kQ4Y/carbon.png)

> :bulb: CheatLogs has an auto save feature. When you close the window of the text editor, the cheatsheet will automatically be saved.

Congratulations! You have added your first cheatsheet into CheatLogs.

<a id="add-command-advanced"></a>
#### 4.1.1.2. Adding a cheatsheet using the advanced mode<font size="5"> [:arrow_up_small:](#table-of-contents)</font>
>Format: `/add /n <CHEATSHEET_NAME> /s <SUBJECT>` <br>
>Flag optionality: `/n` (required)`/s` (required)

For the more experienced users, you can also add cheatsheets using the advanced mode. 
A cheatsheet is first constructed with the name `CHEATSHEET_NAME` and subject `SUBJECT`. 
The Editor will then pop up for you to enter the description of the cheatsheet.
![image](https://i.ibb.co/440k5wv/Screenshot-2020-11-09-at-7-32-00-PM.png)
If a valid description is saved, the cheatsheet is added to the List and stored to the */data* folder in the jar file directory. The expected outcome should be similar to below.

![image](https://i.ibb.co/hV499yH/image.png)

However, if the description is blank or the Editor was canceled, the error message below is shown and the cheatsheet is not saved.
![image](https://i.ibb.co/j3STgFF/Screenshot-2020-11-09-at-6-30-28-PM.png)

If you try to enter a cheatsheet with a name already in the List. You will get a message to input another one, this is depicted below.

![image](https://i.ibb.co/mhgrwN0/image.png)

Examples:
* `/add /n classes /s Java`
* `/add /n Cppthings /s JavaisAwesome`

Shortly after, an editing window will pop up to show the editing window.
Enter the details of your cheatsheet there, then click the `Save` button.

If you want to clear the text editing area, click the `Clear All` button

If you decide to cancel adding the cheatsheet, click the `Cancel` button.
CheatLogs will discard the progress you made in the text editor and the cheatsheet will not be created.

<a id="delete-command"></a>
 
#### 4.1.2. Deleting a cheatsheet: `/delete`<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
From the previous subsection, we learned how to add a cheatsheet into CheatLogs. 

In this section, you will learn how to use the `/delete` function.

You can use the delete command using two modes, **easy** and **advanced** mode.
<a id="delete-command-easy"></a>
#### 4.1.2.1. Deleting a cheatsheet using the easy mode<font size="5"> [:arrow_up_small:](#table-of-contents)</font>
The easy mode of the delete command lets you safely delete cheatsheets by prompting you the name and the index of the cheatsheet.
> Format: `/delete`

The prompts on the screen will request you to enter the name and the index of the cheatsheet; as shown in the picture bellow:
![image](https://i.ibb.co/12w4jCZ/delete-easy-mode.png)

<a id="delete-command-advanced"></a>
#### 4.1.2.2. Deleting a cheatsheet using the advanced mode<font size="5"> [:arrow_up_small:](#table-of-contents)</font>
The advanced mode of the delete command lets you delete a cheatsheet using its index or its name. 
The delete command will also be delete the corresponding cheatsheet from the */data* folder.

To figure out the index of the cheatsheet, you can use the `/list` command.
The first cheatsheet has an `INDEX` of 1.

>Format: `/delete /n CHEATSHEET_NAME /i CHEATSHEET_INDEX` <br>
>
>Flag optionality: [`/n`, `/i`] (At least one) <br>
>
>Format: `/delete /n CHEATSHEET_NAME`<br>
>Format: `/delete /n CHEATSHEET_INDEX` <br>

This command deletes the matching cheatsheet from **the List** with name matching `CHEATSHEET_NAME` or index matching `CHEATSHEET_INDEX` whichever you included. The expected result is similar to below if a matching cheatsheet is found.

This example bellow uses only the `CHEATSHEET_NAME` to delete a cheatsheet.
![image](https://i.ibb.co/vvwTBFb/namedelete.png)

This example bellow uses only the `CHEATSHEET_INDEX` to delete a cheatsheet.
![image](https://i.ibb.co/9bPBS09/delete-easy-1.png)

When either the name or index does not match, CheatLogs will specify the error as shown below.
![image](https://i.ibb.co/WyQMS2v/wrongnameindex.png)

> :bulb: Our program currently does not have any undo functionality.
> Once you delete a cheatsheet, it will be deleted forever, and is not recoverable.

Examples:
* `/delete /n computer /i 15`
* `/delete /i 15` 
* `/delete /n computer`

___

<a id="clear-command"></a>
### 4.1.3. Clearing all entries: `/clear`<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
>Format: `/clear`
>
If you want to reset everything to its original state, you can simply use the `/clear` command instead of using `/delete` multiple times.
This command will delete all cheatsheets from **the List** on your CheatLogs. No need to worry, `/clear` command will not remove the preloaded cheatsheets.
Here is the expected result if currently you have two cheatsheets stored in the application.
![image](https://i.ibb.co/ysXp9DY/clearcommand.png)

Example:
* `/clear`

> :exclamation: The clear function only clears for the user made cheatsheets. <br>
> The preloaded cheatsheet will still appear inside the list.
___


<a id="manipulation-command-type"></a>
## 4.2. Manipulation Commands:  <font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
After adding cheatsheets, you may want to edit them after some time. Manipulation commands allow you to modify the content of a specific cheatsheet in the List.

___

<a id="edit-command"></a>
### 4.2.1. Editing a cheatsheet: `/edit` <font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

>Format: `/edit /n CHEATSHEET_NAME /i CHEATSHEET_INDEX` <br>
>Flag optionality: [`/n`, `/i`] (At least one)

Edits the description of an existing cheatsheet. After `/edit`  is called, CheatLogs will match for a single cheatsheet in **the List** with a name matching `CHEATSHEET_NAME` or index matching `CHEATSHEET_INDEX` whichever you included (it will try to match only the name if you included both). 

On a match, **the Editor** will pop up for you to edit the description of the matched cheatsheet. After you are done editing, saving or canceling **the Editor** updates the cheatsheet details and the message below will be printed on the terminal, showing the updated version of the cheatsheet.

![image](https://i.ibb.co/c8xq2wY/image.png)

When either the name or index does not match, **the Editor** does not pop up and CheatLogs will specify an error as shown below.

![image](https://i.ibb.co/rZ6Rhgn/image.png)

**CheatLogs** does not allow you to save empty descriptions.  **The Editor** will print the error message at the bottom pane (illustrated below) if you try to do so.

![image](https://i.ibb.co/gdGnmZS/image.png)

Examples:
* `/edit /n switch /i 2`
* `/edit /i 3` 
* `/edit /n commands`

____

<a id="favourite-command"></a>
### 4.2.2. Favouriting a cheatsheet: `/fav` <font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

>Format: `/fav /n CHEATSHEET_NAME /i CHEATSHEET_INDEX /d`  <br>
>Flag optionality: [`/n`, `/i`] (At least one), `/d`(optional)

If you have some cheatsheets which are used frequently, you can mark them as favourite so that those cheatsheets will always be displayed on the top of the table when using `/list`. The command `/fav` marks the cheatsheet with a name matching `CHEATSHEET_NAME` or index matching `CHEATSHEET_INDEX` whichever you included.  The expected result is similar to below if a matching cheatsheet is found.

![image](https://i.ibb.co/VW5JZNx/image.png)

When either the name or index does not match, **Cheatlogs** will specify the error as shown below.

![image](https://i.ibb.co/vPgbnbW/image.png)

Favourited cheatsheets show up a the top of the `/list` command table, with a `[*]` beside its name. This is shown below, to the right of `loops`.  This allows you to easily identify and access your favourite cheatsheets. 

![image](https://i.ibb.co/XWztfyX/image.png)

To unfavourite a cheatsheet, you can use the flag   `/d`  in the command e.g. `/fav /n string /d`. It will try to match for a cheatsheet the same way as a regular `fav` (without `/d`) but unfavourites the matched cheatsheet instead. This cheatsheet is printed as shown below.
![image](https://i.ibb.co/F6MpX1m/image.png)

Trying to [un]favourite an already [un]favourited cheatsheet will show an error and the matched cheatsheet. This is as shown below. 
![image](https://i.ibb.co/XWgygYK/image.png)
![image](https://i.ibb.co/cNHZmc6/image.png)

Examples:
* `/fav /n Integer /i 2`
* `/fav /i 1` 
* `/fav /n string`
* `/fav /n string /d`

___

<a id="viewing-command-type"></a>
## 4.3. Viewing Commands: <font size="5"> [:arrow_up_small:](#table-of-contents)</font>

These are commands that allow you to quickly look up **the List** for the cheatsheets you want. It is recommended to use one command after another,
e.g. using `/find` to list all matching cheat lists then `/view` with corresponding name to view the cheatsheet.

Some of these commands present their results in a table form and allow you to sort the results through various filters provided. We will call this ****Sorting Mode****.

In **Sorting Mode**, cheatsheets are originally shown in the order they were found inside the List. You can then sort them in [lexicographical order](https://en.wikipedia.org/wiki/Lexicographic_order#:~:text=In%20mathematics%2C%20the%20lexicographic%20or,of%20a%20totally%20ordered%20set.) 
according to any of the cheatsheet properties. For example , sorting by descending name means to enter`3`in this mode and an illustration of expected output is shown below. 

> :bulb: To exit **Sorting Mode**, enter any characters other than 1 - 4.

![image](https://i.ibb.co/jJZPNdM/image.png)

> :bulb:  Viewing/Deleting cheatsheets using index
> * Index of cheatsheets after sorting in `/list` command can be used to delete/view corresponding cheatsheets
> * However, index of cheatsheets in `/find` command cannot be used to delete/view cheatsheets. You would have to delete/view them using the name.

---

<a id="find-command"></a>
### 4.3.1. Locating cheatsheets with pattern : `/find`<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 


>Format: `/find /s <SUBJECT> /k <KEYWORD>` <br>
>Flag optionality: [`/s`, `/k`] (At least one)

`/find` command allows you to search for cheatsheets using `SUBJECT` and/or `KEYWORD`. The matching cheatsheets would be displayed in a table.

After getting prompted to enter a command, you can search for cheatsheets using:

1. `/find /s <SUBJECT>` to search for cheatsheets with matching subject. More details on the matching algorithm at the end of this section.
2. `/find /k <KEYWORD>` to search for cheatsheets with contents that contains `KEYWORD`.
3. `/find /s <SUBJECT> /k <KEYWORD>` to search for cheatsheets with matching subject and contains `KEYWORD`.

| `/find /s <SUBJECT>` |
| :-------------------------: |
| ![image](https://i.ibb.co/kSVw5r3/image.png) |

| ` /find /k <KEYWORD>` |
| :-------------------------: |
| ![image](https://i.ibb.co/TM4J8s1/image.png) |

| `/find /s <SUBJECT> /k <KEYWORD>` |
| :-------------------------: |
| ![image](https://i.ibb.co/fGdPMdC/image.png) |


Cheatsheets that meet the criteria of the command you entered would be displayed in a table as shown in the images below.

| `/find /s <SUBJECT>` |
| :-------------------------: |
| ![image](https://i.ibb.co/HB7MNJx/image.png) |

| ` /find /k <KEYWORD>` |
| :-------------------------: |
| ![image](https://i.ibb.co/z7X4KF2/image.png) |

| `/find /s <SUBJECT> /k <KEYWORD>` |
| :-------------------------: |
| ![image](https://i.ibb.co/hym26SW/image.png) |

CheatLogs then enters **Sorting Mode**. In **Sorting Mode**, you can sort according to names or subjects by inputting the corresponding index (1-4).

| Name ascending |
| :-------------------------: | 
| ![image](https://i.ibb.co/yPRhvH3/image.png) |

| Subject ascending | 
| :-------------------------: |
| ![image](https://i.ibb.co/z2jHKSB/image.png) |

| Name descending | 
| :-------------------------: | 
| ![image](https://i.ibb.co/f8D0QXY/image.png) |

| Subject descending |
| :-------------------------: | 
| ![image](https://i.ibb.co/ThvTVnG/image.png) |

To exit **Sorting Mode** and simply enter another character (excluding 1-4).

![image](https://i.ibb.co/x8NVsPr/image.png)

However, if none of the cheatsheets meet the criteria of your `/find` command, CheatLogs will not enter **Sorting Mode** as shown in the image below.

![image](https://i.ibb.co/wcqcFxR/image.png)

> :bulb:  Notes on matching algorithm
> * The search is **case-sensitive** e.g. `help` matches `helpers` but not `Help`. 
> * A match contains the search term as a substring. e.g. `java` matches `java11` and  `Tricks for java`

Examples:
* `/find /s loop`
* `/find /s Integer /k 2`
* `/find /k hello`

 ---
 
<a id="view-command"></a>
### 4.3.2. Viewing a specific cheatsheet: `/view`<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
>Format: `/view /n CHEATSHEET_NAME /i CHEATSHEET_INDEX` <br>
>Flag optionality: [`/n`, `/i`] (At least one)

You can view the details of a specific cheatsheet using the `/view` command.
The `view` command requires you to enter either a name or index and CheatLogs will display the content of the cheatsheet that matches what you entered.

After getting prompted to enter a command, you can view a specific cheatsheet using:

1. `/view /n <CHEATSHEET_NAME>` to view the cheatsheet with name `CHEATSHEET_NAME`
2. `/view /i <CHEATSHEET_INDEX>` to view the cheatsheet with index `CHEATSHEET_INDEX`
3. `/view /n <CHEATSHEET_NAME> /i <CHEATSHEET_INDEX>` to view the cheatsheet with name and index corresponding to `CHEATSHEET_NAME` and `CHEATSHEET_INDEX`. 
>:exclamation: If `CHEATSHEET_NAME` and `CHEATSHEET_INDEX` are pointing at two different cheatsheet, no cheatsheet content will be displayed.

| `/view /n <CHEATSHEET_NAME>`|
| :-------------------------: |
| ![image](https://i.ibb.co/ypPympz/image.png) |

| `/view /i <CHEATSHEET_INDEX>` |
| :-------------------------: |
|  ![image](https://i.ibb.co/k58qGf6/image.png) |

| `/view /n <CHEATSHEET_NAME> /i <CHEATSHEET_INDEX>` |
| :-------------------------: |
| ![image](https://i.ibb.co/h7qS4x8/image.png) |

Examples:
* `/view /n Read /i 2`
* `/view /i 1` 
* `/view /n documentation`

---

<a id="list-command"></a>
### 4.3.3. Listing all cheatsheets: `/list`<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

>Format: `/list`

You can use the `/list` command with no additional flags to list all the cheatsheets in **the List** in a table.

After getting prompted to enter a command, you can view a specific cheatsheet using:

* `/list` to list all cheatsheets available.

![image](https://i.ibb.co/zF8F4PM/image.png)

CheatLogs then enters **Sorting Mode**. In **Sorting Mode**, you can sort according to names or subjects by inputting the corresponding index (1-4).

| Name ascending |
| :-------------------------: | 
| ![image](https://i.ibb.co/yPRhvH3/image.png) |

| Subject ascending | 
| :-------------------------: |
| ![image](https://i.ibb.co/z2jHKSB/image.png) |

| Name descending | 
| :-------------------------: | 
| ![image](https://i.ibb.co/f8D0QXY/image.png) |

| Subject descending |
| :-------------------------: | 
| ![image](https://i.ibb.co/ThvTVnG/image.png) |

To exit **Sorting Mode**, simply enter any other characters.

![image](https://i.ibb.co/x8NVsPr/image.png)

Example:
 *  `/list`

<a id="general-command-type"></a>
## 4.4. General Commands: <font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
These are useful general purpose commands that don't fit into the other categories but are still very useful for you to know.

---

<a id="help-command"></a>
### 4.4.1. Viewing help: `/help`<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
>Format: `/help`
>
If you forgot the syntax of a certain command, you can simply type `/help`. It lists all the possible commands that can be executed in the application together with its format and example. Below is what you should expect to see.

![image](https://i.ibb.co/n7gWdpQ/image.png)

Example:
* `/help`
---

<a id="settings-command"></a>
### 4.4.2. Change program settings: `/set`<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
CheatLogs is highly customizable. By using the `/set` command, you can choose to enable/disable the help messages on each command and change the color scheme of the output text. 
The settings will be saved automatically and the next time you launch CheatLogs, it will be exactly the same as the last time you opened it!

<a id="settings-color"></a>
#### 4.4.2.1. Change color scheme<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
>Format: `/set /c COLORSCHEME`<br> 
>Flag optionality: `/c` (required) 


CheatLogs provides 3 additional color scheme options numbered from 1 to 3. Upon command invocation, CheatLogs will change the settings to the one matching `COLORSCHEME`. The image below shows the result of `/set /c` command.

![image](https://i.ibb.co/0JM5gBd/image.png)

If your flag description `COLORSCHEME` does not fall in the range mentioned above, it will change the color scheme to the default setting (option 0).

> :bulb: The colors will likely vary depending on the terminal that you use and differ from the one shown. We suggest simply picking the most readable one.
 
  Example:   
 * `/set /c 2`
 
<a id="settings-help-message"></a>
#### 4.4.2.2. Change behavior of help message<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
>Format: `/set /m [on/off]` <br>
>Flag optionality: `/m` (required) 

CheatLogs provides help messages for each command. Here is an example from `/add` command.

![image](https://i.ibb.co/6wPMRvF/image.png)

You can disable these help messages by using the `/set /m off` and later when you want to re-enable them again, you can type `/set /m on`.
> :bulb: We recommend you to turn on the help messages until you are reasonably comfortable with each command.

  Example:   
 * `/set /m on`
 * `/set /m off`
---

<a id="exit-command"></a>
### 4.4.3. Exiting the program: `/exit`<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
>Format: `/exit`

If you are done using CheatLogs, simple type `/exit` to close the application. CheatLogs hopes you will open it again.

![image](https://i.ibb.co/J2RWkRx/image.png)

 Example:   
 * `/exit`
<br>

<a id="data-storage"></a>
# 5. Data storage<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

CheatLogs provides a robust storage system that works together with certain
commands to store your cheatsheets for future reference. This ensures that you
have a directory of cheatsheet files which are organized and can be utilized
by CheatLogs anytime. Refer to the image below for an example of a cheatsheet
file.

![image](https://i.ibb.co/RDjGFYZ/xml-File-Example.png)

<br>

<a id="data-file-contents"></a>
## 5.1. Data file contents<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

Each cheatsheet file uses an XML file format. This file format organizes the contents
of the file into different sections based on certain attributes of the cheatsheet. The code
snippet below illustrates the structure of the entire cheatsheet file.

![image](https://i.ibb.co/mFJ1nDy/xml-Format.png)

> :exclamation: Editing XML files can render CheatLogs incapable of reading your cheatsheets. You should only change
>or add such files if you an advanced user of CheatLogs.

By following this format, you can manually insert cheatsheet files that are recognized by CheatLogs. The following sections
explore each segment of this format.

> :bulb:  If you are unsure where to place your new files, simply place it in the /data directory. CheatLogs will organize them when you execute a command to add, edit or delete any file.

---

<a id="xml-file-configurations"></a>
### 5.1.1. XML file configurations<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

This section configures the settings of the XML file. By default, CheatLogs writes this line into
XML files that it creates or modifies.

>Format: `<?xml version="1.0" encoding="UTF-8" standalone="no"?>` 

> :bulb: If you are creating a new XML file, you can choose to omit this line entirely. CheatLogs will still convert such XML files into cheatsheets.

> :exclamation: If you are including this section, you should use the exact settings defined by the format above. Any change to this format can result in CheatLogs not converting such files into cheatsheets.

---

<a id="main"></a>
### 5.1.2. Main<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

This section acts as the root element of the document. CheatLogs analyses the relevant
sections you place inside `main` and creates a cheatsheet based on the input given by them.

>Format: `<main>CONTENTS</main>` 

> :bulb:  You can rearrange the order of sections within CONTENTS. CheatLogs does not take the ordering of such sections into account when parsing XML files.

> :exclamation: Any section that you do not insert into CONTENTS will not be included in the cheatsheet.

---

<a id="favourite"></a>
### 5.1.3. Favourite<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

This section indicates if the cheatsheet should be marked as [favourite](#favourite-command). You can use
this to mark cheatsheets which you want to view in the list of your favourite cheatsheets.

>Format: `<favourite>STATUS</favourite>`

> :memo:  STATUS is not case-sensitive. For example, `YES` and `yes` are considered the same.

> :exclamation: If STATUS contains another word than `YES`, the cheatsheet will not be marked as a favourite. 

---

<a id="subject"></a>
### 5.1.4. Subject<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

This section includes the subject of the cheatsheet. It allows CheatLogs to organize your cheat
sheet files by assigning cheatsheets of the same subject to the same folder.

>Format: `<subject>SUBJECT</subject>`

> :exclamation: SUBJECT cannot take in special characters. You will
>  **not** be able to insert XML files with such subjects into CheatLogs.

---

<a id="contents"></a>
### 5.1.5. Contents<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

This section includes the contents of the cheatsheet. You can type the notes that you want to see in your cheatsheet
here.

>Format: `<contents>CONTENTS</contents>`

> :bulb:  You can append the contents on a separate line.

<a id="data-file-organization"></a>
## 5.2. Data organization<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

All the data files can be found in the */data* directory, which is located in the same directory as
CheatLogs.jar. Within */data*, CheatLogs stores data files in subdirectories whose name matches its subject name. This gives you a directory of cheatsheets organized by subject, which you can use
to retrieve any external cheatsheet file. 

The figure below shows a sample organization of the cheatsheet files in a user's directory.


![image](https://i.ibb.co/zbppwZZ/sample-User-Data.png)

In the example illustrated above, the user currently has cheatsheets which are of
3 different subjects. Even though some cheatsheets have the same name such as
arrays.xml, they are categorized into different folders as they do not share the same
subject name. This allows you to create cheatsheets for common concepts which may differ
based on the subject you are taking.

<a id="preloaded-data-files"></a>
## 5.3. Preloaded data files<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 

CheatLogs.jar contains some example cheatsheet files. These files will be moved over to the */data* directory when you run the application for the first time. To differentiate these files from your 
personally created cheatsheets, they are placed under the */preloaded* subdirectory. By viewing and
editing these cheatsheets through CheatLogs, you will understand how to operate this program.

The figure below shows a sample organization of the cheatsheet files in a user's directory with
two preloaded cheat cheatsheets included.

![image](https://i.ibb.co/bzp4yJ2/preloaded-Illustration.png)

In the example above, you can see that CheatLogs keeps the organization of such preloaded cheatsheets separate
from the other cheatsheet files. This is to help you to better identify files marked as
preloaded within the */data* directory.

> :exclamation: If you create a new file within any subdirectory of */preloaded*, CheatLogs will assume that these files have been preloaded and will treat them as such.

<br>

<a id="faq"></a>
# 6. FAQ<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
**Q**: How do I transfer my data to another computer? <br>
**A**: You can simply drag and drop the `cheatlogs.jar`  and the `/data` directory in that same folder into the other computer.

**Q**: Why is CheatLogs so strict on formatting!?<br>
**A**: CheatLogs is still under development but we plan to provide better ways for you to input ways in the future.

**Q**: Will future updates break my current cheatsheets?<br>
**A**: The current structure of cheatsheets may change in the future, but we plan to provide you ways to convert so that you can enjoy the new features. 

<br>

<a id="command-cheatsheet"></a>
# 7. Command Cheatsheet<font size="5"> [:arrow_up_small:](#table-of-contents)</font> 
The table below is for quick and easy reference to the CheatLogs commands with examples of use.

Action | Format | Examples
-------- | ---------- | ------------
Add | /add /n <CHEATSHEET_NAME> /s \<SUBJECT> | /add /n List /s Java
Delete | /delete /i <CHEATSHEET_INDEX> <br> /delete /n <CHEATSHEET_NAME> | /delete /n List <br> /delete /i 1
Clear | /clear | /clear
Edit | /edit /i <CHEATSHEET_INDEX> <br> /edit /n <CHEATSHEET_NAME> | /edit /i 1 <br> /edit /n List
Favourite | /fav /i <CHEATSHEET_INDEX> \[/d\] <br> /fav /n <CHEATSHEET_NAME> \[/d\]| /fav /i 2 <br> /fav /i 3 /d <br> /fav /n Cheat <br> /fav /n arrays /d 
Find | /find /s \<SUBJECT> /k \<KEYWORD> | /find /s Java <br> /find /s Java /k cheater
View | /view /i <CHEATSHEET_INDEX> <br>/view /n <CHEATSHEET_NAME> | /view /i 3 <br> /view /n List
List | /list | /list
Help | /help | /help
Settings | /set /c <OPTION_NUMBER> <br> /set /m \<OPTION> | /set /c 1 <br> /set /m on <br> /set /m off
Exit | /exit | /exit

