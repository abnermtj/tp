# Aldo Maximillian Sugito - Project Portfolio Page

## Overview
CheatLogs is a cheatsheet management application that revolutionizes the world of programming.
CheatLogs uses a hybrid of Command Line (CLI) and Graphical User Interface (GUI) to interact with the user. 
We believe that the command line interface provides a fast user interaction.
While the graphical user interface, provides extra convenience to type long contents with a simple and a familiar interface for the user.
___
### Summary of Contributions
#### Code Contributed
You can see the codes that I contributed using the link bellow:

[Aldo's Contribution](https://nus-cs2113-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=aldo&sort=groupTitle&sortWithin=title&since=2020-09-27&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=domaxi&tabRepo=AY2021S1-CS2113T-W11-3%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other)
___
### Features Implemented
#### Added Graphical User Interface for Adding and Editing Cheatsheet
The text editor is used to provide a graphical user interface for the user to add and edit the content of the cheatsheet.
The Java Swing library is used in the implementation of the text editor.
Inside the text editor, therer are buttons that can assist the user in inputting their cheatsheet content.
* Action buttons to control the editor (`Save`, `Clear All`, `Cancel`)
* Editing buttons to help with editing (`Copy`, `Paste`, `Cut`)

*Highlights*

Implementing the text editor was one of the most important chunk of the user interface.
At first, we opted to use the Java Desktop class for the text editor, and use the system text editor.
However, we believe that it would potentially create a dependency problem from using different systems.

Therefore, we opted to use the JavaSwing library.
* The JTextEditor class is used to implement the text editor. 
* The layout of the text editor by using JPanel in each of the elements.
* The buttons as an action event to trigger commands, such as Copy, Cut, Paste, Clear All, Cancel, and Save.
* The waitForCommand() needed to be implemented to halt the program execution while the text editor is open.
___
#### The CheatSheet Class
The cheatsheet class is used to contain the attributes of the cheatsheets. 

*Hightlights* 

The cheatsheet class is the basis of the features implemented in our program. It dictates how the DataStorage class is implemented and also the functionality of almost all of the program.
The main challenge is to determine what are the member attributes that needs to be added in the class.
___
#### The Preloaded CheatSheets
Preloaded cheatsheets is a built-in feature of CheatLogs, that is automatically loaded into the CheatLogs.

*Highlights*

The preloaded cheatsheets is quite difficult to implement. I helped my colleague to implement the initial version of the preloaded cheatsheets.
Moving on our development timeline, we used XML files instead of the usual .txt file to store the cheatsheets, as it already have a built in tags to separate the contents of the cheatsheet.

#### Footer Display on Text Editor
THe footer of the text editor can be used to display not the information. 
The footer panel can also be used to display error to the user.

*Highlights*

The footer is implemented using a JPanel that is inserted insiede the BoxLayout of the Editor.
The footer is displayed using the JLabel class, and using its methods, the content can be customized.

___
### Project Management
* Perform manual testing and bug catching for the application
* Administer and maintain the team repository.
* Review and comment on team's Pull Requests.
* Perform merge conflict resolution for Pull Requests.
___

#### Contribution to team-based tasks
- Created team's Repository on Github including ths team's access permissions.
- Helped the team to maintain the [issue tracker](https://github.com/AY2021S1-CS2113T-W11-3/tp/issues?q=is%3Aissue+author%3Aadhy-p+).
- Proofread the User Guide and make necessary amendments.
___

#### Documentation
* User Guide
    For the user guide, I am responsible for the following sections:
    
    * **Section 3** which covers the Graphical User Interface (GUI) and the commands associated with the text editor
    * **Section 4.1** which covers all the storage commands of CheatLogs.
* Developer Guide
    For the developer guide, I am responsible for the following sections:
    
    * **Section 4.2.3.2** which covers the AddCommand description and the sequence diagram
    * **Section 4.2.3.3** which covers the EditCommand description and the sequence diagram
    * **Section 4.2.3.4** which covers the ViewCommand description and the sequence diagram
    * **Section 4.2.3.5** which covers the ExitCommand description and the sequence diagram
    * **Section 5.2** which covers the content editor
    * **Section 10.3** which covers the use cases
___
#### Review/Mentoring Contributions
* I helped the team with repository maintenance, mostly about git (Pull Requests, Branches, Merge Conflicts, Rebasing, etc).
* I helped determine the format for the storage (using XML file).

Here are the pull requests I helped review and merged:
- [#93](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/93)
- [#22](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/22/)
- [#19](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/19)
- [#109](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/108)

Here are the issues that I raised
-[220](https://github.com/AY2021S1-CS2113T-W11-3/tp/issues/220)
-[218](https://github.com/AY2021S1-CS2113T-W11-3/tp/issues/218)
-[149](https://github.com/AY2021S1-CS2113T-W11-3/tp/issues/149)
-[147](https://github.com/AY2021S1-CS2113T-W11-3/tp/issues/147)
___
