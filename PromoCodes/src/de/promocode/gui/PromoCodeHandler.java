package de.promocode.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.promocode.logic.CodeSearch;

public class PromoCodeHandler implements ActionListener {

	private PromoCodeWindow mainWindow;

	public PromoCodeHandler(PromoCodeWindow _mainWindow) {
		this.mainWindow = _mainWindow;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// Hole Quelle
		Object obj = event.getSource();

		if (obj == mainWindow.getBtnBeenden()) {
			System.exit(0);
		}

		if (obj == mainWindow.getBtnSuchen()) {
			long code = mainWindow.getTfdSuche().getNumber();
			long z1 = System.currentTimeMillis();
			if (CodeSearch.findPromoCode(mainWindow.getListCodes(), code) == CodeSearch.NOT_FOUND) {
				long z2 = System.currentTimeMillis();
				mainWindow.getLblFeedback().setText("UNGÜLTIG " + (z2-z1) + "ms");
				mainWindow.getLblFeedback().setForeground(new Color(0x990000));
			} else {
				long z2 = System.currentTimeMillis();
				mainWindow.getLblFeedback().setText("Code o.k. " + (z2-z1) + "ms");
				mainWindow.getLblFeedback().setForeground(new Color(0x009900));
			}
		}
	}
}
