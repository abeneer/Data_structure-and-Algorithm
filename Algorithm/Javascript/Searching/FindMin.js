const numbers = [56,9,12,34, 67, 7,12];

function findMin(arr){
    if(arr.length === 0){
        return undefined;
    }
    let min = arr[0];

    for(let i = 0; i < arr.length; i++){
        if(arr[i] < min){
            min = arr[i]
        }
    }
    return min;
}

console.log(findMin(numbers));
