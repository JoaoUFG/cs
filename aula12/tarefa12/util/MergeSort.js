export class MergeSort {
    static mergeSortIterative(arr) {
        const n = arr.length;
        let currentSize = 1;

        while (currentSize < n - 1) {
            let left = 0;

            while (left < n - 1) {
                const mid = Math.min(left + currentSize - 1, n - 1);
                const right = Math.min(left + 2 * currentSize - 1, n - 1);

                mergeIterative(arr, left, mid, right);
                left += 2 * currentSize;
            }

            currentSize *= 2;
        }
        return arr;
    }

    static mergeSortRecursive(arr) {
        const n = arr.length;

        if (n > 1) {
            const mid = Math.floor(n / 2);
            const leftArray = arr.slice(0, mid);
            const rightArray = arr.slice(mid);

            this.mergeSortRecursive(leftArray);
            this.mergeSortRecursive(rightArray);

            mergeRecursive(arr, leftArray, rightArray);
        }
        return arr;
    }



}
function mergeIterative(arr, left, mid, right) {
    const n1 = mid - left + 1;
    const n2 = right - mid;

    const L = new Array(n1);
    const R = new Array(n2);

    for (let i = 0; i < n1; i++) {
        L[i] = arr[left + i];
    }
    for (let j = 0; j < n2; j++) {
        R[j] = arr[mid + 1 + j];
    }

    let i = 0;
    let j = 0;
    let k = left;

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}

function mergeRecursive(arr, left, right) {
    let i = 0;
    let j = 0;
    let k = 0;

    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            arr[k] = left[i];
            i++;
        } else {
            arr[k] = right[j];
            j++;
        }
        k++;
    }

    while (i < left.length) {
        arr[k] = left[i];
        i++;
        k++;
    }

    while (j < right.length) {
        arr[k] = right[j];
        j++;
        k++;
    }
}




