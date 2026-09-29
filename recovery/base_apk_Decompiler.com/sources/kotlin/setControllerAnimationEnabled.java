package kotlin;

import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/AbstractDeserializer$IconCompatParcelizer;", "", "p0", "p1", "", "read", "(Lo/AbstractDeserializer$IconCompatParcelizer;Ljava/lang/String;Ljava/lang/String;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setControllerAnimationEnabled {
    public static /* synthetic */ void read$default(AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "�";
        }
        read(iconCompatParcelizer, str, str2);
    }

    public static final void read(AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer, String str, String str2) {
        if (str2.length() <= 0) {
            getRootStableInsets.RemoteActionCompatParcelizer("alternateText can't be an empty string.");
        }
        iconCompatParcelizer.IconCompatParcelizer("androidx.compose.foundation.text.inlineContent", str);
        iconCompatParcelizer.RemoteActionCompatParcelizer(str2);
        iconCompatParcelizer.write();
    }
}
