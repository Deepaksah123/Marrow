package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/createDeserializationContext;", "Lo/weirdNumberException;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/createDeserializationContext;Lo/weirdNumberException;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _newWriter {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(createDeserializationContext createdeserializationcontext, weirdNumberException weirdnumberexception) {
        int iIconCompatParcelizer;
        createDeserializationContext createdeserializationcontextOnAddQueueItem = createdeserializationcontext.onAddQueueItem();
        if (createdeserializationcontextOnAddQueueItem == null) {
            StringBuilder sb = new StringBuilder("Child of ");
            sb.append(createdeserializationcontext);
            sb.append(" cannot be null when calculating alignment line");
            reportWrongTokenException.read(sb.toString());
        }
        if (createdeserializationcontext.onMediaButtonEvent().AudioAttributesImplApi26Parcelizer().containsKey(weirdnumberexception)) {
            Integer num = createdeserializationcontext.onMediaButtonEvent().AudioAttributesImplApi26Parcelizer().get(weirdnumberexception);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iAudioAttributesCompatParcelizer = createdeserializationcontextOnAddQueueItem.AudioAttributesCompatParcelizer(weirdnumberexception);
        if (iAudioAttributesCompatParcelizer == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        createdeserializationcontextOnAddQueueItem.read(true);
        createdeserializationcontext.RemoteActionCompatParcelizer(true);
        createdeserializationcontext.onRewind();
        createdeserializationcontextOnAddQueueItem.read(false);
        createdeserializationcontext.RemoteActionCompatParcelizer(false);
        if (weirdnumberexception instanceof getInterfaces) {
            iIconCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(createdeserializationcontextOnAddQueueItem.getOnPrepareFromSearch());
        } else {
            iIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(createdeserializationcontextOnAddQueueItem.getOnPrepareFromSearch());
        }
        return iAudioAttributesCompatParcelizer + iIconCompatParcelizer;
    }
}
