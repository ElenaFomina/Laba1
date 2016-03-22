

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class Prodaga { 
public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.dd.mm"); 
public static void main(String[] args) throws IOException { 
int menu = 5; 
while (menu != 4){ 
System.out.println(); 
System.out.println("1. ������� ������ \n2. �������� ������ \n3. ������ �� �������� \n4. ����� �� ��������"); 
Scanner in = new Scanner(System.in); 
menu = in.nextInt(); 
FileInputStream fis = new FileInputStream("C:/Users/����/Documents/NetBeansProjects/������� �������/tovaru.xls"); 
Workbook wb = new HSSFWorkbook(fis);
FileInputStream fs = new FileInputStream("C:/Users/����/Documents/NetBeansProjects/������� �������/prodaga.xls"); 
Workbook wb2 = new HSSFWorkbook(fs); 
switch (menu) { 
case 1: 
for (org.apache.poi.ss.usermodel.Row row: wb.getSheetAt(0)){ 
for (Cell cell: row){ 
System.out.print(getCellText(cell)); 
System.out.print(" "); 
} 
System.out.println(); 
} 
int vvod = 4; 
while (vvod != 3) 
{ 
System.out.println("1. ���� �� �������� \n2. ���� �� id \n3. ������ �������"); 

vvod = in.nextInt(); 
switch (vvod) {
case 1: 
BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
System.out.println("������� ��� � �����������"); 
String name = br.readLine(); 
double quantity = in.nextDouble(); 
int i=-1; 
//int j2=-1; 
int idsale = 0; 
int stroka2 = 0; 
for (org.apache.poi.ss.usermodel.Row row: wb.getSheetAt(0)) 
{ 
i++; 
for (Cell cell: row) 

if (getCellText(cell).equals(name)) 
{ 
cell = wb.getSheetAt(0).getRow(i).getCell(3); 
if (cell.getNumericCellValue() < quantity) 
System.out.println("������ �� ������� �� ������"); 
else 
{ 
for (org.apache.poi.ss.usermodel.Row row2: wb2.getSheetAt(0)) 
{stroka2++; 
for (Cell cell9: row2);} 
Row row2 = wb2.getSheetAt(0).createRow(stroka2); 
idsale = stroka2; 
Cell cell5 = row2.createCell(0); 
cell5.setCellValue(idsale); 
Cell cell6 = wb.getSheetAt(0).getRow(i).getCell(2); 
Cell cell7 = row2.createCell(1); 
cell7.setCellValue(quantity*cell6.getNumericCellValue()); 

cell.setCellValue(cell.getNumericCellValue()-quantity); 

Row row3 = wb2.getSheetAt(1).createRow(stroka2); 
Cell cell10 = row3.createCell(0); 
cell10.setCellValue(name); 
Cell cell11 = row3.createCell(1); 
cell11.setCellValue(quantity); 
} 
}} 
/*for (org.apache.poi.ss.usermodel.Row row: wb.getSheetAt(0)){ 
for (Cell cell: row){ 
System.out.print(getCellText(cell)); 
System.out.print(" "); 
} 
System.out.println(); 
} */ 
break; 
case 2: 
BufferedReader br2 = new BufferedReader (new InputStreamReader(System.in)); 
System.out.println("������� id � �����������"); 
String id3 = br2.readLine(); 
double quantity3 = in.nextDouble(); 
int j=-1; 
int idsale2 = 0; 
int stroka3 = 0; 
for (org.apache.poi.ss.usermodel.Row row: wb.getSheetAt(0)) 
{ 
j++; 
for (Cell cell: row) 
if (getCellText(cell).equals(id3)) 
{ 
cell = wb.getSheetAt(0).getRow(j).getCell(3); 
if (cell.getNumericCellValue() < quantity3) 
System.out.println("������ �� ������� �� ������"); 
else 
{ 
for (org.apache.poi.ss.usermodel.Row row2: wb2.getSheetAt(0)) 
{stroka3++; 
for (Cell cell9: row2);} 
Row row2 = wb2.getSheetAt(0).createRow(stroka3);
idsale = stroka3; 
Cell cell5 = row2.createCell(0); 
cell5.setCellValue(idsale); 
Cell cell6 = wb.getSheetAt(0).getRow(j).getCell(2); 
Cell cell7 = row2.createCell(1); 
cell7.setCellValue(quantity3*cell6.getNumericCellValue()); 
cell.setCellValue(cell.getNumericCellValue()-quantity3); 

cell = wb.getSheetAt(0).getRow(j).getCell(1); 
Row row3 = wb2.getSheetAt(1).createRow(stroka3); 
Cell cell10 = row3.createCell(0); 
cell10.setCellValue(getCellText(cell)); 
Cell cell11 = row3.createCell(1); 
cell11.setCellValue(quantity3); 
} 
}} 
break; 

case 3: 

FileOutputStream fs2 = new FileOutputStream("C:/Users/����/Documents/NetBeansProjects/������� �������/prodaga.xls");
wb2.write(fs2); 
fs2.close(); 
FileOutputStream fos = new FileOutputStream("C:/Users/����/Documents/NetBeansProjects/������� �������/tovaru.xls"); 
wb.write(fos); 
fos.close(); 
break; 
} 
} 
break; 
case 2: 
int stroka = -1; 
for (org.apache.poi.ss.usermodel.Row row: wb.getSheetAt(0)) 
{stroka++; 
for (Cell cell: row);} 
System.out.println("������� id � ����������"); 
BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
String id = br.readLine(); 
int j=-1; 
int proverka = 1; 
double quantity2 = in.nextDouble(); 
for (org.apache.poi.ss.usermodel.Row row: wb.getSheetAt(0)) 
{ 
j++; 
for (Cell cell: row) 
if (getCellText(cell).equals(id)) 
{ proverka=0; 
cell = wb.getSheetAt(0).getRow(j).getCell(3); 
cell.setCellValue(cell.getNumericCellValue()+quantity2); 
FileOutputStream fos = new FileOutputStream("C:/Users/����/Documents/NetBeansProjects/������� �������/tovaru.xls"); 
wb.write(fos); 
fos.close(); 
} 
} 
if (proverka == 1) 
{ 
System.out.println("������� �������� � ����"); 
String name2 = br.readLine(); 
double price = in.nextDouble(); 
Row row = wb.getSheetAt(0).createRow(stroka); 

Cell cell1 = row.createCell(0); 
cell1.setCellValue(id); 
Cell cell2 = row.createCell(1); 
cell2.setCellValue(name2); 
Cell cell3 = row.createCell(2); 
cell3.setCellValue(price); 
Cell cell4 = row.createCell(3); 
cell4.setCellValue(quantity2); 
FileOutputStream fos = new FileOutputStream("C:/Users/����/Documents/NetBeansProjects/������� �������/tovaru.xls"); 
wb.write(fos); 
fos.close(); 
} 

for (org.apache.poi.ss.usermodel.Row row: wb.getSheetAt(0)){ 
for (Cell cell: row){ 
System.out.print(getCellText(cell)); 
System.out.print(" "); 
} 
System.out.println(); 
} 
break; 
case 3: 
int j2=-1; 
for (org.apache.poi.ss.usermodel.Row row: wb2.getSheetAt(0)){ 
for (Cell cell: row){ 
System.out.print(getCellText(cell)); 
System.out.print(" "); 
} 
System.out.println(); 
} 
System.out.println("������� id �������"); 
int id4 = in.nextInt(); 

for (org.apache.poi.ss.usermodel.Row row4: wb2.getSheetAt(1)) 
{j2++; 
for (Cell cell12: row4) 
{ 
if (j2==id4) 
{ 
System.out.print(getCellText(cell12)); 
System.out.print(" "); 
} 
} 
} 
break; 
} 
}} 
public static String getCellText(Cell cell){ 
String result=""; 
switch (cell.getCellType()) { 
case Cell.CELL_TYPE_STRING: 
result = cell.getRichStringCellValue().getString(); 
break; 
case Cell.CELL_TYPE_NUMERIC: 
if (DateUtil.isCellDateFormatted(cell)) { 
result = sdf.format(cell.getDateCellValue()); 
} else { 
result = Double.toString(cell.getNumericCellValue()); 
} 
break; 
case Cell.CELL_TYPE_BOOLEAN: 
result = Boolean.toString(cell.getBooleanCellValue()); 
break; 
case Cell.CELL_TYPE_FORMULA: 
System.out.println(cell.getCellFormula()); 
break; 
default: 
System.out.println(); 
} 
return result; 
} 
}	
