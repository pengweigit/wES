package org.datasays.wes;

/**
 * Created by watano on 2016/11/21.
 */
public interface IRequestInfo {
    public Object getBody();
    public String parseUrl(String method);
}