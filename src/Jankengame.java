/* �u�W�����P���Q�[���v
 * 3�񏟕�
 * 0�c�O�[ / 1�c�`���L / 2�c�p�[
 */

import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;
import java.util.Random;

public class Jankengame extends Applet {
	
	//�A�v���b�g�̏�����
	public void init() {
		//�A�v���b�g�̔w�i�F�̎w��
		setBackground(new Color(255, 255, 255));
	}
	
	public void paint(Graphics g) {
		//�R���s���[�^�̎�
		Image Crandom = getImage(getDocumentBase(), "img/random.gif");
		Image Cpaper = getImage(getDocumentBase(), "img/paper.jpg");
		Image Cscissors = getImage(getDocumentBase(), "img/scissors.jpg");
		Image Cstone = getImage(getDocumentBase(), "img/stone.jpg");
		
		//�摜�̕`��
		g.drawImage(Crandom, 20, 10, this);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int win = 0, rose = 0;

		// 3�񏟕�
		for (int count = 0; count < 3; count++) {
			// �R���s���[�^�̎�𐶐�
			int comp = rand.nextInt(3);		//script�ɓ`����
			
			// �v���C���[�̎��ǂݍ���
			int user;
			do {
				user = stdIn.nextInt();			//script����ǂݍ��ނɂ́H
			} while (user < 0 || user > 2);		
			
			// ����
			int judge = (comp - user + 3) % 3;
			switch (judge) {
			case 0: break;				//������
			case 1: win++;		break;	//����
			case 2: rose++;		break;	//����
			}
		}
		
		// ����
		if (win > rose)
			System.out.println("win");
		else if (win < rose)
			System.out.println("rose");
		else
			System.out.println("draw");
		
		stdIn.close();
	}
}
