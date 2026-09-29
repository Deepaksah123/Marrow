package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/AccountTransferClient;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "read", "write", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountTransferClient {
    private static final /* synthetic */ AccountTransferClient[] AudioAttributesImplApi26Parcelizer;
    public static final AccountTransferClient RemoteActionCompatParcelizer = new AccountTransferClient("INCORRECT_QBANK", 0);
    public static final AccountTransferClient AudioAttributesCompatParcelizer = new AccountTransferClient("ATTEMPTED_QBANK", 1);
    public static final AccountTransferClient MediaBrowserCompatCustomActionResultReceiver = new AccountTransferClient("UNATTEMPTED_QBANK", 2);
    public static final AccountTransferClient IconCompatParcelizer = new AccountTransferClient("BOOKMARKED", 3);
    public static final AccountTransferClient AudioAttributesImplBaseParcelizer = new AccountTransferClient("STARRED", 4);
    public static final AccountTransferClient AudioAttributesImplApi21Parcelizer = new AccountTransferClient("QUESTIONED", 5);
    public static final AccountTransferClient read = new AccountTransferClient("CORRECT_GT", 6);
    public static final AccountTransferClient write = new AccountTransferClient("INCORRECT_GT", 7);
    public static final AccountTransferClient MediaBrowserCompatItemReceiver = new AccountTransferClient("SKIPPED_GT", 8);

    private AccountTransferClient(String str, int i) {
    }

    static {
        AccountTransferClient[] accountTransferClientArr = read();
        AudioAttributesImplApi26Parcelizer = accountTransferClientArr;
        getMagicModuleTimeline.IconCompatParcelizer(accountTransferClientArr);
    }

    private static final /* synthetic */ AccountTransferClient[] read() {
        return new AccountTransferClient[]{RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver, IconCompatParcelizer, AudioAttributesImplBaseParcelizer, AudioAttributesImplApi21Parcelizer, read, write, MediaBrowserCompatItemReceiver};
    }

    public static AccountTransferClient valueOf(String str) {
        return (AccountTransferClient) Enum.valueOf(AccountTransferClient.class, str);
    }

    public static AccountTransferClient[] values() {
        return (AccountTransferClient[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
