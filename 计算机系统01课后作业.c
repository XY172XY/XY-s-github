#include<stdio.h>
int dfs1(int n, int m) {
	return m == 0 ? n : dfs1(m, n % m);//շת�����������
}
int dfs2(int n, int m) {
	if (m == n) {
		//շת������յ�
		return m;
	}
	if (m > n) {
		//ʼ����n>m
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
	//�����㷨��ռ�ÿռ���󣬵���
	printf("%d\n", dfs2(n, m));
	//�����㷨�����ӣ���ռ�ÿռ�С
	return 0;
}