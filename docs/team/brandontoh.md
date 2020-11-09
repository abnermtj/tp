# Toh Yong Xiang Brandon - Project Portfolio Page

## Overview
CheatLogs is a free and open-source cheatsheet manager with blazing fast organization, editing and searching via a command-line interface (CLI) and graphical user interface (GUI) . 

Written in Java (~5000 Lines of Code).

## Summary of Contributions
### Code Contributed

The link to the code I wrote can be found [here](https://nus-cs2113-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=w11-3&sort=groupTitle&sortWithin=title&since=2020-09-27&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=brandontoh&tabRepo=AY2021S1-CS2113T-W11-3%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code)

---
### Features/Enhancements Implemented
I was in charge of the **SortFilter** class, **add** command, **view** command, **find** command, **list** command and **TablePrinter**class.

#### 1. Sorting feature
The `SortFilter` class first prompt the user to input a number to choose the type of sort (ascending name, descending name, ascending subject, descending subject). 
After the user have entered a number, `SortFilter` uses `java.util.Collections` and `comparator` to sorts the cheatsheets.

*Highlights*

We considered use of loops at first, but we felt that there will too many duplicated codes and will not be flexible. Thus, we ended up with `sort()` from `Collections` and `comparator` which is more flexible.

#### 2. add, view, find, list commands
The `add` command allows the user to add cheatsheet with name, subject and content. The content will be inputted via an editor which Aldo is in-charge of.

The `view` command allows the user to either enter a name or index, then CheatLogs will find the matching cheatsheet in cheatSheetList and print the content of the cheatsheet.

The `find` command allows the user to find cheatsheets by name, subject or keyword from the contents. `find` command also make use of `SortFilter` to allow user to sort the matched cheatsheets.

The `list` command lists all the cheatsheets in cheatSheetList. `list` command also make use of `SortFilter` to allow user to sort all the cheatsheets.

*Highlights*

`find` and `list` commands used to be very basic as it just prints out name, subject and content of the cheatsheets. However, by incorporating classes like `SortFilter` and `TablePrinter` into the commands, we managed to make it more interactive the user to use. The user now can sort their cheatsheets and view their cheatsheets in more pleasing manner.

#### 3. TablePrinter class 
The `TablePrinter` class formats the name, subject and content and prints them out in a table format.

*Highlights*

Formatting of the table took alot of time. The `TablePrinter` class is made of many `for` loops and are mostly just hard coding. Most of the time, it was a try and error to see whether the output is what we wanted as single change in the `for` loop could cause a drastic change in the output.

---
### Contributions to Documentation
I contributed to **section 4.3** of UG: 
- `/find` command
- `/view` command
- `/list` command

I contributed to **section 4.2** and **section 4.2.6.6 - 4.2.3.8** of DG: 
- Command parser
- `/list` command
- `/find` command
- `/setting` command

I also contributed to **section 5.3** and **section 10.4** of DG:
- Sorting feature
- Non-Functional Requirements

---
### Contribution to team-based tasks
- Created milestones on GitHub to make the planning and management of the project easier.
- Helped the team to maintain the [issue tracker](https://github.com/AY2021S1-CS2113T-W11-3/tp/issues?q=is%3Aissue+author%3Abrandontoh).
- Proofread the User Guide & Developer Guide and made necessary amendments.

---
