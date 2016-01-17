package base;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import methods.Matrix_Add;
import methods.Matrix_Create;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author root
 */
public class TestCreate {

    public TestCreate() {
    }

    @Test
    public void testCreateMatrix() {
        System.out.println("Test tworzenia macierzy");

        int[] inputData = {
            1, 2, 3, 4,
            7, 6, 5, 4,
            3, 5, 7, 9,
            1, 4, 8, 0
        };
        Matrix_Create matrix_Create = new Matrix_Create();
        matrix_Create.setAdjencyMatrix(inputData, 4);
    }
}
