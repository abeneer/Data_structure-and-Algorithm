const numbers = [1, 10, 100, 1000, 10000];
target = 1000;
console.log("Array Elements")
for( let i = 0; i< numbers.length; i++){
    // console.log(numbers[i]);
}

function linearSearch(arr, target){
    if(arr.length === 0){
        return -1;
    }

    for(let index = 0; index < arr.length; index++){
        if(arr[index] === target){
            return index;
        }
    }

    return -1
}

function linearSearch2(arr, target){
    if(arr.length===0){
        return -1;
    }

    for(let element of arr){
        if(element === target){
            return element;
        }
    }

    return -1
}

console.log(linearSearch(numbers, target))
console.log(linearSearch2(numbers, target))