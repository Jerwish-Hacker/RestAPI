# RestAPI
Just a Rest API 


# DB - Create DB name `FireDB`

		Create database `FireDB`;

# Course

Get
http://localhost:8080/course/getcourse

Post
http://localhost:8080/course/addcourse

body

{
"title":"Java",
"semester":"One",
"unit":"One",
"location":"Chennai",
"time":"12:00"
}

# Student

Get
http://localhost:8080/course/getstudent

Post
http://localhost:8080/course/addstudent

{
"fname":"Rahul",
"lname":"M",
"phone":9233548836,
"gpa":90
}

# Instructor

Get
http://localhost:8080/course/getinstructor

Post
http://localhost:8080/course/addinstructor

body

{
"firstname":"Justin",
"lastname":"Raj",
"ranks":"One",
"salary":100000,
"department":"FullStack"
}
