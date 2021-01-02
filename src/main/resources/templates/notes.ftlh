<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>List of Users</title>
</head>
<body>
<nav role="navigation">
    <ul>
        <li><a href="/">Home</a></li>
        <li><a href="/note/create">Create a new note</a></li>
    </ul>
</nav>

<h1>List of Notes</h1>

<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Content</th>
    </tr>
    </thead>
    <tbody>
    <#list notes as note>
    <tr>
        <td>${note.title}</td>
        <td>${note.content}</td>
    </tr>
    </#list>
    </tbody>
</table>
</body>
</html>