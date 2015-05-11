
import java.util.Scanner;
import java.util.Random;

public class Jankengame {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		String[] hands = {"�O�[", "�`���L", "�p�["};
		int retry;
		
		do {
			//�R���s���[�^�̎�𐶐�
			int comp = rand.nextInt(3);
			
			//�v���C���[�̎��ǂݍ���
			int user;
			do {
				System.out.print("����񂯂�|��");
				for (int i = 0; i < 3; i++)
					System.out.printf("(%d)%s", i, hands[i]);
				System.out.print("�F");
				user = stdIn.nextInt();
			} while (user < 0 || user > 2);
			
			//���҂̎��\��
			System.out.println("����" + hands[comp] + "�ŁA���Ȃ���" + hands[user] + "�ł��B");
			
			//����
			int judge = (user - comp + 3) % 3;
			switch (judge) {
			case 0: System.out.println("���������ł��B");		break;
			case 1: System.out.println("���Ȃ��̏����ł��B");		break;
			case 2: System.out.println("���Ȃ��̕����ł��B");		break;
			}
			
			//���g���C�m�F
			do {
				System.out.print("������x�H (0)������ (1)�͂��@�F");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
		
		stdIn.close();
	}
}
