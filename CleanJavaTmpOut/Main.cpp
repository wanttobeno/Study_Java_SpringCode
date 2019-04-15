

#include <TCHAR.H>
#include <WINDOWS.H>
#include <string>
using namespace std;

#include <iostream>
#include <cstring>        // for strcat()
#include <io.h>


#ifndef _INTPTR_T_DEFINED
#ifdef _WIN64
typedef __int64			 intptr_t;
#else  /* _WIN64 */
typedef  long            intptr_t;
#endif  /* _WIN64 */
#define _INTPTR_T_DEFINED
#endif  /* _INTPTR_T_DEFINED */

// https://blog.csdn.net/yuyuweiwei0718/article/details/79596146
bool RemoveDir(const char* szFileDir)
{
	std::string strDir = szFileDir;
	if (strDir.at(strDir.length()-1) != '\\')
		strDir += '\\';
	WIN32_FIND_DATAA wfd;
	HANDLE hFind = FindFirstFileA((strDir + "*.*").c_str(),&wfd);
	if (hFind == INVALID_HANDLE_VALUE)
		return false;
	do
	{
		if (wfd.dwFileAttributes & FILE_ATTRIBUTE_DIRECTORY)
		{
			if (stricmp(wfd.cFileName,".") != 0 &&
				stricmp(wfd.cFileName,"..") != 0)
				RemoveDir( (strDir + wfd.cFileName).c_str());
		}
		else
		{
			DeleteFileA( (strDir + wfd.cFileName).c_str());
		}
	}
	while (FindNextFileA(hFind,&wfd));
	FindClose(hFind);
	RemoveDirectoryA(szFileDir);
	return true;
}

void listFiles(const char * dir)
{
	cout << dir << std::endl;
    intptr_t handle;
    _finddata_t findData;
	
    handle = _findfirst(dir, &findData);    // ����Ŀ¼�еĵ�һ���ļ�
    if (handle == -1)
    {
        cout << "Failed to find first file!\n";
        return;
    }
	
    do
    {
		if (findData.attrib & _A_SUBDIR && strcmp(findData.name, ".") != 0 && strcmp(findData.name, "..") != 0)
		{
			char subDir[MAX_PATH + 1] = { 0 };
			strcat(subDir, dir);
			char* pDir = strstr(subDir, "*.*");
			if (pDir)
			{
				strcpy(pDir, findData.name);
			}
			if (stricmp(findData.name, "out") == 0)
			{
				RemoveDir(subDir);
			}
			else
			{
				strcat(subDir, "\\*.*");
				listFiles(subDir);
			}
		}
	// �Ƿ�����Ŀ¼���Ҳ�Ϊ"."��".."
    //    if (findData.attrib & _A_SUBDIR
    //        && strcmp(findData.name, ".") == 0
    //        && strcmp(findData.name, "..") == 0)    
				//cout << findData.name << "\t<dir>\n";
    //    else
    //        cout << findData.name << "\t" << findData.size << endl;
    } while (_findnext(handle, &findData) == 0);    // ����Ŀ¼�е���һ���ļ�
	
    _findclose(handle);    // �ر��������
}

int main(int agrc,char* agrv[]) 
{
	cout << "ɾ����ǰ�ļ����µ�����outĿ¼���޷��ָ�" <<std::endl;
	system("pause");
	char dir[MAX_PATH+1] = {0};
	GetCurrentDirectoryA(MAX_PATH,dir);
	strcat(dir,"\\*.*");
	listFiles(dir);
	cout << "Done!\n";
	return 0;
}


