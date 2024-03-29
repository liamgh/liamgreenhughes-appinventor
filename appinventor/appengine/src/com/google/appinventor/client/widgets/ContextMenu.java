// Copyright 2009 Google Inc. All Rights Reserved.

package com.google.appinventor.client.widgets;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.PopupPanel;

/**
 * Context menu widget implementation.
 *
 */
public final class ContextMenu {

  // UI elements
  private final PopupPanel popupPanel;
  private final MenuBar menuBar;

  /**
   * Creates a new context menu.
   */
  public ContextMenu() {
    popupPanel = new PopupPanel(true);  // autoHide

    menuBar = new MenuBar(true);
    menuBar.setStylePrimaryName("ode-ContextMenu");
    popupPanel.add(menuBar);
  }

  /**
   * Adds a menu item to the context menu.
   *
   * @param text  caption of menu item
   * @param command   command to execute when menu item is chosen
   * @return  menu item
   */
  public MenuItem addItem(String text, final Command command) {
    MenuItem menuItem = new MenuItem(text, new Command() {
      @Override
      public void execute() {
        hide();
        command.execute();
      }
    });
    menuItem.setStylePrimaryName("ode-ContextMenuItem");
    menuBar.addItem(menuItem);
    return menuItem;
  }

  /**
   * Shows the context menu.
   */
  public void show() {
    popupPanel.show();
  }

  /**
   * Sets the popup's position using a PopupPanel.PositionCallback, and shows the popup.
   */
  public void setPopupPositionAndShow(PopupPanel.PositionCallback callback) {
    popupPanel.setPopupPositionAndShow(callback);
  }

  /**
   * Sets the popup position of the context menu.
   */
  public void setPopupPosition(int left, int top) {
    popupPanel.setPopupPosition(left, top);
  }

  /**
   * Hides the context menu.
   */
  public void hide() {
    popupPanel.hide();
  }
}
