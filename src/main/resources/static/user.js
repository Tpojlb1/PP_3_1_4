// let currentUser = "";
// fetch("http://localhost:8080/api/user/").then(res => res.json())
//     .then(data => {
//         currentUser = data;
//         console.log(data)
//         showOneUser(currentUser);
//     })
//
//
//
//
// function showOneUser(user) {
//     let temp = "";
//     temp += "<tr>"
//     temp += "<td>" + user.id + "</td>"
//     temp += "<td>" + user.name + "</td>"
//     // temp += "<td>" + user.lastName + "</td>"
//     // temp += "<td>" + user.age + "</td>"
//     // temp += "<td>" + user.country + "</td>"
//     temp += "<td>" + user.username + "</td>"
//     temp += "</tr>"
//     document.getElementById("oneUserBody").innerHTML = temp;
// }