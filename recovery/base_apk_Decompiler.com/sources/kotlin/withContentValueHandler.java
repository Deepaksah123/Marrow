package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JI\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\r\u0010\u000eJa\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\r\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/withContentValueHandler;", "Lo/getValueHandler;", "", "p0", "p1", "", "Lo/weirdNumberException;", "p2", "Lkotlin/Function1;", "Lo/_parser$IconCompatParcelizer;", "", "p3", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(IILjava/util/Map;Lo/getAnswerMap;)Lo/withHandlersFrom;", "Lo/JsonNode;", "p4", "(IILjava/util/Map;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/withHandlersFrom;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface withContentValueHandler extends getValueHandler {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ withHandlersFrom AudioAttributesCompatParcelizer$default(withContentValueHandler withcontentvaluehandler, int i, int i2, Map map, getAnswerMap getanswermap, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = VideoTimelineResponseBody.read();
        }
        return withcontentvaluehandler.AudioAttributesCompatParcelizer(i, i2, map, getanswermap);
    }

    default withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p3) {
        return AudioAttributesCompatParcelizer(p0, p1, p2, null, p3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ withHandlersFrom AudioAttributesCompatParcelizer$default(withContentValueHandler withcontentvaluehandler, int i, int i2, Map map, getAnswerMap getanswermap, getAnswerMap getanswermap2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = VideoTimelineResponseBody.read();
        }
        Map map2 = map;
        if ((i3 & 8) != 0) {
            getanswermap = null;
        }
        return withcontentvaluehandler.AudioAttributesCompatParcelizer(i, i2, map2, getanswermap, getanswermap2);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/withContentValueHandler$RemoteActionCompatParcelizer;", "Lo/withHandlersFrom;", "", "onMediaButtonEvent", "()V", "", "MediaBrowserCompatItemReceiver", "I", "onFastForward", "()I", "RemoteActionCompatParcelizer", "read", "onAddQueueItem", "write", "", "Lo/weirdNumberException;", "Ljava/util/Map;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "IconCompatParcelizer", "Lkotlin/Function1;", "Lo/JsonNode;", "AudioAttributesImplApi21Parcelizer", "Lo/getAnswerMap;", "onPause", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements withHandlersFrom {
        final /* synthetic */ int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private final getAnswerMap<JsonNode, getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> IconCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final Map<weirdNumberException, Integer> IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int write;
        final /* synthetic */ withContentValueHandler write;

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(int i, int i2, Map<weirdNumberException, Integer> map, getAnswerMap<? super JsonNode, getShowPopup> getanswermap, withContentValueHandler withcontentvaluehandler, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> getanswermap2) {
            this.AudioAttributesCompatParcelizer = i;
            this.write = withcontentvaluehandler;
            this.IconCompatParcelizer = getanswermap2;
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
            this.IconCompatParcelizer = map;
            this.AudioAttributesCompatParcelizer = getanswermap;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.withHandlersFrom
        public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        public final getAnswerMap<JsonNode, getShowPopup> onPause() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.withHandlersFrom
        public final void onMediaButtonEvent() {
            withContentValueHandler withcontentvaluehandler = this.write;
            if (withcontentvaluehandler instanceof createDeserializationContext) {
                this.IconCompatParcelizer.invoke(((createDeserializationContext) withcontentvaluehandler).getMediaDescriptionCompat());
            } else {
                this.IconCompatParcelizer.invoke(new fields(this.AudioAttributesCompatParcelizer, withcontentvaluehandler.getRemoteActionCompatParcelizer(), this.write.getWrite(), this.write.getRead()));
            }
        }
    }

    default withHandlersFrom AudioAttributesCompatParcelizer(int p0, int p1, Map<weirdNumberException, Integer> p2, getAnswerMap<? super JsonNode, getShowPopup> p3, getAnswerMap<? super _parser.IconCompatParcelizer, getShowPopup> p4) {
        if ((p0 & (-16777216)) != 0 || ((-16777216) & p1) != 0) {
            StringBuilder sb = new StringBuilder("Size(");
            sb.append(p0);
            sb.append(" x ");
            sb.append(p1);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            reportWrongTokenException.read(sb.toString());
        }
        return new RemoteActionCompatParcelizer(p0, p1, p2, p3, this, p4);
    }
}
