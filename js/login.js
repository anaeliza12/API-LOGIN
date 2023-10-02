

const dataEmail = document.getElementById("email")
const dataPassword = document.getElementById("password")

const loginData = {
    email: "",
    password: ""

}
const login = async () => {

    const options = {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(loginData)
    }
    const url = "http://localhost:8080/login/auth"
    try {

        const connection = await fetch(url, options)
        const response = connection.status

        if (response == 200) {
            const log = await connection.text()
            alert(log)

        } else if (response == 404) {

            alert("Login incorreto")
        }

    } catch (error) {
        console.log(error)
    }



}

document.addEventListener("DOMContentLoaded", () => {
    const form = document.querySelector("form")

    form.addEventListener('submit', (event) => {
        event.preventDefault()

        loginData.email = dataEmail.value
        loginData.password = dataPassword.value
        login()
    })

})