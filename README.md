# 2021-Philadelphia-Shooting-Victims-Database
For this project, I used PostgreSQL to build a database for storing data related to shooting victims in Philadelphia that occured in 2021. `incidents_part1.cvs` and `incidents_part2.csv` provided the main dataset. My goals for this project are as follows:
  - Create `victims.csv` for storing all 2021 shooting victims data
  - Ceate the database `Homicide`with the table `Shooting_Victims`
  - Create `Shooting_Victims` with appropriate data types from `victims.csv`
  - Create `master` and `student` user groups with appropriate privleges
  - Create users `senior` and `junior` and assign to `master` and `junior` groups
  - Verify privligaes of User Groups

# Exploring the Dataset File 
I first opened `incidents_part1.csv` & `incidents_part1.csv` and extracted the following header (column names) and the associated first data rows:
  - `district`
  - `code`
  - `date`
  - `time_est`
  - `race`
  - `sex`
  - `latino`
  - `age`
  - `wound`
  - `fatal`
  - `officer_involved`
  - `officer_injured`
  - `officer_deceased`
  - `location`
for the results above, `location`, `officer_deceased`, `officer_injured`, `officer_involved`, `wound`, `race`, & `sex` are represented by the data type `varchar(100)`. `district`, `code`, `latino`, `age`, & `fatal` are represented by the data type `integer`. `date` is respresented by the data type `date` and `time` is represented by the data type `integer`
# Creating the Database & Table with Appropriate Data Types
I opened PostgreSQL and first created the Database `Homicide` to store the table that will include the aforementioned headers and associated data rows. After creating the `Homicide` database, I created the table `Shooting_Victims` with the appropriate data types:
 - `district` - `INTEGER`
  - `code` - `INTEGER`
  - `latino` - `INTEGER`
  - `age` - `INTEGER`
  - `fatal` - `INTEGER`
  - `date` - `INTEGER`
  - `time_est` - `TIME`
  - `race` - `VARCHAR(100)`
  - `sex` - `VARCHAR(100)`
  - `wound` - `VARCHAR(100)`
  - `officer_involved` - `VARCHAR(100)`
  - `officer_injured` - `VARCHAR(100)`
  - `officer_deceased` - `VARCHAR(100)`
  - `location` - `VARCHAR(100)`
  
  

