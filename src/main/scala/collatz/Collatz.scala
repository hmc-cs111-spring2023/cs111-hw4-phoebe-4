@main def collatz(n: Int) =
    if n % 2 == 0 then n / 2
    else (3 * n) + 1 