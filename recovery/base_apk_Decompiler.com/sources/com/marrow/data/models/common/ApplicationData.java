package com.marrow.data.models.common;

import com.marrow.data.api.models.response.EnvironmentData;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.utils.product.exceptions.UserLoggedOutException;
import java.util.Map;
import kotlin.accessgetEmptyStatecp;

/* JADX INFO: loaded from: classes.dex */
public interface ApplicationData {
    void cancelNotifications();

    void clearAllAppData(boolean z);

    void clearCache(boolean z);

    void deleteCourseTables();

    void deleteOfflineDownloadedFiles();

    void deleteSearchTables();

    void deleteSkipIntroTable();

    void deleteTablesForEditionSwitch();

    void flushData();

    String getFontHash();

    @Deprecated
    LoggedUser getLoggedUser();

    accessgetEmptyStatecp<String[]> getTablesWithNullPrimaryKeysRows();

    void logFirebaseException(Map<String, String> map);

    void logFontExceptionCrash(Exception exc, String str);

    void logout();

    void logout(int i, String str);

    void logout(ResponseError responseError);

    @Deprecated
    void onEnvironmentVariableUpdate(EnvironmentData environmentData);

    void onProfileUpdated(boolean z);

    void promptApiBlockDrivenAction(String str);

    void promptContactVerificationFlow();

    void refreshSubscription();

    LoggedUser requireLoggedUser() throws UserLoggedOutException;

    void stopAllServices();

    void timestampInvalid(ResponseError responseError);

    @Deprecated
    void updateUserTable(LoggedUser loggedUser);
}
