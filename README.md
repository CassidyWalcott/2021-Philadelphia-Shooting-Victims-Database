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
  - `time`
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

