package com.Task1.service;

import com.Task1.model.Employee;
import com.Task1.reposiatory.EmployeeRepository;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

@Service
public class EmployeeServiceImpl {
    @Autowired
    private EmployeeRepository emprepository;
    public void savefiledata(InputStream file) throws IOException {
        List<Employee> emplist=new LinkedList<Employee>();
        Workbook workbook= WorkbookFactory.create(file);
        Sheet sheet=workbook.getSheetAt(0);
        sheet.forEach(row ->{
            Employee employee=new Employee();
            if(row.getRowNum()!=0){
                employee.setEmpName(row.getCell(0).getStringCellValue());
                employee.setEmpid((int) row.getCell(1).getNumericCellValue());
                emplist.add(employee);

            }
        });
        emprepository.saveAll(emplist);

    }
    public List<Employee> findall(){
        return emprepository.findAll();
    }
}
