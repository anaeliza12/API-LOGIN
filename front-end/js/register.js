const email = document.getElementById("email")
const name = document.getElementById("name")
const password = document.getElementById("password")
const confirmPassword = document.getElementById("confirmPassword")


const registerData = {
    name: "",
    email: "",
    password: "",
    confirmPassword:""
}
const register = async () => {
    const options = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(registerData)
    }
    const url = "http://localhost:8080/register";
    try {
        const connection = await fetch(url, options)
        const status = connection.status
        const log = await connection.text()

        if(status == 201){
            alert(log)
        }else if (status == 404){
            alert("Password confirmation does not match")
        }

        
    } catch (error) {
        console.log(error)
    }
    
}

document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById("form")
    
    form.addEventListener('submit', (event) => {
        event.preventDefault()
        registerData.name = name.value
        registerData.email = email.value
        registerData.password = password.value
        registerData.confirmPassword = confirmPassword.value

        register()

        
    })
})

