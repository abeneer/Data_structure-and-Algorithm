const name = "Abner";
const target = "A";

function SearchInString(str, target){
    if(str.length === 0){
        return -1;
    }

    for(let i = 0; i < str.length; i++){
        if(str[i] === target){
            return i;
        }
    }
    return -1;
}

function SearchInString2(str, target){
    if(str.length === 0){
        return -1;
    }

    for(let element of str){
        if(element === target){
            return element;
        }
    }

    return -1;``

}

console.log((SearchInString(name, target)));
console.log((SearchInString2(name, target)));
