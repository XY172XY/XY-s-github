#include<stdio.h>
int dfs1(int n, int m) {
	return m == 0 ? n : dfs1(m, n % m);//辗转相除，裴蜀定理
}
int dfs2(int n, int m) {
	if (m == n) {
		//辗转相减的终点
		return m;
	}
	if (m > n) {
		//始终让n>m
		return dfs2(m, n);
	}
	if (n % 2) {
		if (m % 2) {
			return dfs2(m, n - m);
		}
		else {
			return dfs2(n, m / 2);
		}
	}
	else {
		if (m % 2) {
			return dfs2(n / 2, m);
		}
		else {
			return 2 * dfs2(n / 2, m / 2);
		}
	}
}
int main() {
	int n, m;
	scanf("%d%d", &n, &m);
	printf("%d\n", dfs1(n, m));
	//这种算法，占用空间更大，但简单
	printf("%d\n", dfs2(n, m));
	//这种算法，复杂，但占用空间小
	return 0;
}