function solution(input) {
    let numbers = input.split(" ").map(element => Number(element))
    console.log(numbers[0] + numbers[1])
}

const readline = require("readline")
const rl = readline.createInterface({
    input : process.stdin,
    output : process.stdout
})
rl.on("line", (line)=>{
    input=line
    rl.close()
}).on("close", ()=> {
    solution(input)
    process.exit()
})