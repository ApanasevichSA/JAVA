package com.company;

/**
 * Created by Admin on 28.06.17.
 */
public class Incremenator extends Thread {
    private volatile boolean mIsIncrement = true;
    private volatile boolean mFinish = false;

    public void changeAction()	//������ �������� �� ���������������
    {
        mIsIncrement = !mIsIncrement;
    }
    public void finish()		//���������� ���������� ������
    {
        mFinish = true;
    }

    @Override
    public void run()
    {
        do
        {
            if(!mFinish)	//�������� �� ������������� ����������
            {
                if(mIsIncrement)
                    Main.mValue++;	//���������
                else
                    Main.mValue--;	//���������

                //����� �������� �������� ����������
                System.out.print(Main.mValue + " ");
            }
            else
                return;		//���������� ������

            try{
                Thread.sleep(1000);		//������������ ������ �� 1 ���.
            }catch(InterruptedException e){}
        }
        while(true);
    }
}
