// Copyright 2009 Google Inc. All Rights Reserved.

package com.google.appinventor.server;

import com.google.appinventor.shared.rpc.user.UserInfoProvider;


import javax.servlet.http.HttpServlet;

/**
 * Class supporting ODE servlets, which ODE servlets
 * should subclass instead of {@link javax.servlet.http.HttpServlet}.
 * TODO(user): This class used to handle logging. For now it is left here
 * as a placeholder in case we need to do something beyond what
 * {@link javax.servlet.http.HttpServlet} would do.
 *
 *
 * <p>The class {@link OdeRemoteServiceServlet} serves an analogous purpose for
 * GWT RPCs.
 *
 */
public abstract class OdeServlet extends HttpServlet {

  protected final transient UserInfoProvider userInfoProvider = LocalUser.getInstance();
}
