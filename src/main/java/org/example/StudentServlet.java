package com.example.studentrecords;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServlet {

    @GetMapping("/students")
    public String students() {

        return """
                <html>
                <head>
                    <title>Student Records</title>

                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            text-align: center;
                            background-color: #f4f4f4;
                        }

                        h1 {
                            color: #333;
                        }

                        table {
                            margin: 30px auto;
                            border-collapse: collapse;
                            width: 70%;
                            background-color: white;
                        }

                        th, td {
                            border: 1px solid black;
                            padding: 12px;
                        }

                        th {
                            background-color: #ddd;
                        }
                    </style>
                </head>

                <body>

                    <h1>Student Records</h1>

                    <table>

                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Course</th>
                            <th>Year</th>
                            <th>Email</th>
                        </tr>

                        <tr>
                            <td>101</td>
                            <td>Harshitha</td>
                            <td>CSE</td>
                            <td>3</td>
                            <td>harshitha@gmail.com</td>
                        </tr>

                        <tr>
                            <td>102</td>
                            <td>Ravi</td>
                            <td>CSE</td>
                            <td>3</td>
                            <td>ravi@gmail.com</td>
                        </tr>

                        <tr>
                            <td>103</td>
                            <td>Priya</td>
                            <td>ECE</td>
                            <td>3</td>
                            <td>priya@gmail.com</td>
                        </tr>

                    </table>

                </body>
                </html>
                """;
    }
}