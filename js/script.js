const login = async () => {

    const url = await fetch("http://localhost:8080/login/auth", { mode: "no-cors" })
    const json = await url.json()

    console.log(json)
}

login()
