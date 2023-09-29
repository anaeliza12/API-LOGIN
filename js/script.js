const dataEmail = document.getElementById("email")


const loginData = {
    email: "ana@gmail",
    password: "123"
}

const login = async () => {
    
    const options = {
        method: "POST",
        headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(loginData)
        }

        const url = "http://localhost:8080/login/auth"
        try {

            const response = await fetch(url, options)


        } catch (error) {
            console.error(error)
        }
        
    }
    
    
    document.addEventListener("DOMContentLoaded", () => {
        login()
    })

