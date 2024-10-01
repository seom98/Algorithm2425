const input = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n').map(line => line.split(' ').map(Number));

const b = [0, 1, 2, 3];
const p = new Array(1001).fill(0);

// main 함수에 해당하는 부분
function main() {
    // 입력값을 배열에 저장
    for (let x in b) {
        b[x] = input[Math.floor(x / 2)][x % 2];
    }

    // 소수 개수 배열 계산
    for (let n = 2; n < 1001; n++) {
        p[n] = p[n - 1] + P(n);
    }

    // 결과 계산 및 출력
    const result = G(0, 1) > G(2, 3) ? "yt" : 
                   G(0, 1) < G(2, 3) ? "yj" : 
                   Math.min(G(2, 1), G(0, 3)) % 2 < 1 ? "yj" : "yt";

    console.log(result);
}

// 소수 판별 함수
function P(n) {
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return 0;
    }
    return 1;
}

// G 함수
function G(x, y) {
    return p[b[y]] - p[b[x] - 1];
}

// main 함수 호출
main();
