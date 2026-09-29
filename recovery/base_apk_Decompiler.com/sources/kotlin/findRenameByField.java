package kotlin;

import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J[\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0018JI\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJI\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010 \u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!Ja\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\b\u001a\u00020#2\u0006\u0010\n\u001a\u00020\"2\u0006\u0010\f\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\u001b\u0010&JQ\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020'2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010(JQ\u0010 \u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010)JI\u0010*\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+Ja\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010-JA\u0010*\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010/JA\u0010*\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u00100J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0002¢\u0006\u0004\b4\u00103J\u0017\u0010 \u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u00105JE\u0010\u001b\u001a\u0002012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020$H\u0002¢\u0006\u0004\b\u001b\u00106JC\u0010\u001d\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020$H\u0002¢\u0006\u0004\b\u001d\u00107Je\u0010\u0015\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u0002082\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b\u0015\u00109Jg\u0010 \u001a\u0002012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u0002082\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b \u0010:J\u001b\u0010\u001b\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010;R\u001a\u0010 \u001a\u00020<8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010=\u001a\u0004\b\u001b\u0010>R\u0014\u0010\u001d\u001a\u00020?8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010@R\u0014\u0010\u001b\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010AR\u0014\u0010*\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010AR\u001a\u0010\u0015\u001a\u00020B8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010C\u001a\u0004\b\u001d\u0010DR\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010ER\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010E"}, d2 = {"Lo/findRenameByField;", "Lo/findSetterInfo;", "<init>", "()V", "Lo/Instantiatable;", "p0", "Lo/getReferencedType;", "p1", "p2", "", "p3", "Lo/findAutoDetectVisibility;", "p4", "Lo/setCurrentLength;", "p5", "p6", "Lo/switchAndReturnNext;", "p7", "Lo/createInstance;", "p8", "", "IconCompatParcelizer", "(Lo/Instantiatable;JJFILo/setCurrentLength;FLo/switchAndReturnNext;I)V", "Lo/switchToNext;", "(JJJFILo/setCurrentLength;FLo/switchAndReturnNext;I)V", "Lo/calloc;", "Lo/findViews;", "write", "(Lo/Instantiatable;JJFLo/findViews;Lo/switchAndReturnNext;I)V", "read", "(JJJFLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/unshare;", "RemoteActionCompatParcelizer", "(Lo/unshare;JFLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/hasReferringProperties;", "Lo/getKey;", "Lo/TextBuffer;", "p9", "(Lo/unshare;JJJJFLo/findViews;Lo/switchAndReturnNext;II)V", "Lo/TypeReference;", "(Lo/Instantiatable;JJJFLo/findViews;Lo/switchAndReturnNext;I)V", "(JJJJLo/findViews;FLo/switchAndReturnNext;I)V", "AudioAttributesCompatParcelizer", "(JFJFLo/findViews;Lo/switchAndReturnNext;I)V", "", "(JFFZJJFLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/removeSoftRefsClearedByGc;", "(Lo/removeSoftRefsClearedByGc;JFLo/findViews;Lo/switchAndReturnNext;I)V", "(Lo/removeSoftRefsClearedByGc;Lo/Instantiatable;FLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/releaseBuffers;", "AudioAttributesImplBaseParcelizer", "()Lo/releaseBuffers;", "MediaBrowserCompatItemReceiver", "(Lo/findViews;)Lo/releaseBuffers;", "(Lo/Instantiatable;Lo/findViews;FLo/switchAndReturnNext;II)Lo/releaseBuffers;", "(JLo/findViews;FLo/switchAndReturnNext;II)Lo/releaseBuffers;", "Lo/findCreatorBinding;", "(JFFIILo/setCurrentLength;FLo/switchAndReturnNext;II)Lo/releaseBuffers;", "(Lo/Instantiatable;FFIILo/setCurrentLength;FLo/switchAndReturnNext;II)Lo/releaseBuffers;", "(JF)J", "Lo/findRenameByField$write;", "Lo/findRenameByField$write;", "()Lo/findRenameByField$write;", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "()F", "Lo/findSerializationTyping;", "Lo/findSerializationTyping;", "()Lo/findSerializationTyping;", "Lo/releaseBuffers;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findRenameByField implements findSetterInfo {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final write RemoteActionCompatParcelizer = new write(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final findSerializationTyping IconCompatParcelizer = new IconCompatParcelizer();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private releaseBuffers MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private releaseBuffers AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from getter */
    public final write getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.findSetterInfo
    public final tryToResolveUnresolved RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getAudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getWrite().getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getWrite().getIconCompatParcelizer();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0006\u0010\u0013R$\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00158W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0006\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a\"\u0004\b\b\u0010\u001b"}, d2 = {"Lo/findRenameByField$IconCompatParcelizer;", "Lo/findSerializationTyping;", "Lo/JsonParserDelegate;", "p0", "IconCompatParcelizer", "()Lo/JsonParserDelegate;", "AudioAttributesCompatParcelizer", "(Lo/JsonParserDelegate;)V", "write", "Lo/calloc;", "()J", "(J)V", "Lo/findTypeName;", "Lo/findTypeName;", "MediaBrowserCompatItemReceiver", "()Lo/findTypeName;", "RemoteActionCompatParcelizer", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "(Lo/tryToResolveUnresolved;)V", "read", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)V", "Lo/hasAnyGetter;", "Lo/hasAnyGetter;", "()Lo/hasAnyGetter;", "(Lo/hasAnyGetter;)V", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements findSerializationTyping {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private hasAnyGetter AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final findTypeName RemoteActionCompatParcelizer = findSubtypes.AudioAttributesCompatParcelizer(this);

        IconCompatParcelizer() {
        }

        @Override // kotlin.findSerializationTyping
        public final JsonParserDelegate IconCompatParcelizer() {
            return findRenameByField.this.getRemoteActionCompatParcelizer().read();
        }

        @Override // kotlin.findSerializationTyping
        public final void AudioAttributesCompatParcelizer(JsonParserDelegate jsonParserDelegate) {
            findRenameByField.this.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(jsonParserDelegate);
        }

        @Override // kotlin.findSerializationTyping
        public final long AudioAttributesCompatParcelizer() {
            return findRenameByField.this.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
        }

        @Override // kotlin.findSerializationTyping
        public final void IconCompatParcelizer(long j) {
            findRenameByField.this.getRemoteActionCompatParcelizer().RemoteActionCompatParcelizer(j);
        }

        @Override // kotlin.findSerializationTyping
        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final findTypeName getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.findSerializationTyping
        public final tryToResolveUnresolved write() {
            return findRenameByField.this.getRemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver();
        }

        @Override // kotlin.findSerializationTyping
        public final void AudioAttributesCompatParcelizer(tryToResolveUnresolved trytoresolveunresolved) {
            findRenameByField.this.getRemoteActionCompatParcelizer().IconCompatParcelizer(trytoresolveunresolved);
        }

        @Override // kotlin.findSerializationTyping
        public final bufferMapProperty read() {
            return findRenameByField.this.getRemoteActionCompatParcelizer().getWrite();
        }

        @Override // kotlin.findSerializationTyping
        public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty) {
            findRenameByField.this.getRemoteActionCompatParcelizer().IconCompatParcelizer(buffermapproperty);
        }

        @Override // kotlin.findSerializationTyping
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final hasAnyGetter getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // kotlin.findSerializationTyping
        public final void write(hasAnyGetter hasanygetter) {
            this.AudioAttributesImplApi26Parcelizer = hasanygetter;
        }
    }

    @Override // kotlin.findSetterInfo
    /* JADX INFO: renamed from: read, reason: from getter */
    public final findSerializationTyping getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.findSetterInfo
    public final void IconCompatParcelizer(Instantiatable p0, long p1, long p2, float p3, int p4, setCurrentLength p5, float p6, switchAndReturnNext p7, int p8) {
        this.RemoteActionCompatParcelizer.read().write(p1, p2, RemoteActionCompatParcelizer$default(this, p0, p3, 4.0f, p4, findCreatorBinding.INSTANCE.RemoteActionCompatParcelizer(), p5, p6, p7, p8, 0, 512, null));
    }

    @Override // kotlin.findSetterInfo
    public final void IconCompatParcelizer(long p0, long p1, long p2, float p3, int p4, setCurrentLength p5, float p6, switchAndReturnNext p7, int p8) {
        this.RemoteActionCompatParcelizer.read().write(p1, p2, IconCompatParcelizer$default(this, p0, p3, 4.0f, p4, findCreatorBinding.INSTANCE.RemoteActionCompatParcelizer(), p5, p6, p7, p8, 0, 512, null));
    }

    @Override // kotlin.findSetterInfo
    public final void write(Instantiatable p0, long p1, long p2, float p3, findViews p4, switchAndReturnNext p5, int p6) {
        JsonParserDelegate jsonParserDelegate = this.RemoteActionCompatParcelizer.read();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) p1;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        jsonParserDelegate.read(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) p2), write$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // kotlin.findSetterInfo
    public final void read(long p0, long p1, long p2, float p3, findViews p4, switchAndReturnNext p5, int p6) {
        JsonParserDelegate jsonParserDelegate = this.RemoteActionCompatParcelizer.read();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) p1;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        jsonParserDelegate.read(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) p2), read$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // kotlin.findSetterInfo
    public final void RemoteActionCompatParcelizer(unshare p0, long p1, float p2, findViews p3, switchAndReturnNext p4, int p5) {
        this.RemoteActionCompatParcelizer.read().RemoteActionCompatParcelizer(p0, p1, write$default(this, null, p3, p2, p4, p5, 0, 32, null));
    }

    @Override // kotlin.findSetterInfo
    public final void write(unshare p0, long p1, long p2, long p3, long p4, float p5, findViews p6, switchAndReturnNext p7, int p8, int p9) {
        this.RemoteActionCompatParcelizer.read().write(p0, p1, p2, p3, p4, write(null, p6, p5, p7, p8, p9));
    }

    @Override // kotlin.findSetterInfo
    public final void read(Instantiatable p0, long p1, long p2, long p3, float p4, findViews p5, switchAndReturnNext p6, int p7) {
        JsonParserDelegate jsonParserDelegate = this.RemoteActionCompatParcelizer.read();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) p1;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        jsonParserDelegate.read(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) p2), Float.intBitsToFloat((int) (p3 >> 32)), Float.intBitsToFloat((int) p3), write$default(this, p0, p5, p4, p6, p7, 0, 32, null));
    }

    @Override // kotlin.findSetterInfo
    public final void RemoteActionCompatParcelizer(long p0, long p1, long p2, long p3, findViews p4, float p5, switchAndReturnNext p6, int p7) {
        JsonParserDelegate jsonParserDelegate = this.RemoteActionCompatParcelizer.read();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) p1;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        jsonParserDelegate.read(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) p2), Float.intBitsToFloat((int) (p3 >> 32)), Float.intBitsToFloat((int) p3), read$default(this, p0, p4, p5, p6, p7, 0, 32, null));
    }

    @Override // kotlin.findSetterInfo
    public final void AudioAttributesCompatParcelizer(long p0, float p1, long p2, float p3, findViews p4, switchAndReturnNext p5, int p6) {
        this.RemoteActionCompatParcelizer.read().read(p2, p1, read$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // kotlin.findSetterInfo
    public final void write(long p0, float p1, float p2, boolean p3, long p4, long p5, float p6, findViews p7, switchAndReturnNext p8, int p9) {
        JsonParserDelegate jsonParserDelegate = this.RemoteActionCompatParcelizer.read();
        int i = (int) (p4 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) p4;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p5 >> 32));
        jsonParserDelegate.read(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) p5), p1, p2, p3, read$default(this, p0, p7, p6, p8, p9, 0, 32, null));
    }

    @Override // kotlin.findSetterInfo
    public final void AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc p0, long p1, float p2, findViews p3, switchAndReturnNext p4, int p5) {
        this.RemoteActionCompatParcelizer.read().write(p0, read$default(this, p1, p3, p2, p4, p5, 0, 32, null));
    }

    @Override // kotlin.findSetterInfo
    public final void AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc p0, Instantiatable p1, float p2, findViews p3, switchAndReturnNext p4, int p5) {
        this.RemoteActionCompatParcelizer.read().write(p0, write$default(this, p1, p3, p2, p4, p5, 0, 32, null));
    }

    private final releaseBuffers AudioAttributesImplBaseParcelizer() {
        releaseBuffers releasebuffers = this.AudioAttributesImplBaseParcelizer;
        if (releasebuffers != null) {
            return releasebuffers;
        }
        releaseBuffers releasebuffersAudioAttributesCompatParcelizer = fromInitial.AudioAttributesCompatParcelizer();
        releasebuffersAudioAttributesCompatParcelizer.write(ThreadLocalBufferManager.INSTANCE.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = releasebuffersAudioAttributesCompatParcelizer;
        return releasebuffersAudioAttributesCompatParcelizer;
    }

    private final releaseBuffers MediaBrowserCompatItemReceiver() {
        releaseBuffers releasebuffers = this.MediaBrowserCompatItemReceiver;
        if (releasebuffers != null) {
            return releasebuffers;
        }
        releaseBuffers releasebuffersAudioAttributesCompatParcelizer = fromInitial.AudioAttributesCompatParcelizer();
        releasebuffersAudioAttributesCompatParcelizer.write(ThreadLocalBufferManager.INSTANCE.write());
        this.MediaBrowserCompatItemReceiver = releasebuffersAudioAttributesCompatParcelizer;
        return releasebuffersAudioAttributesCompatParcelizer;
    }

    private final releaseBuffers RemoteActionCompatParcelizer(findViews p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, findTypeResolver.INSTANCE)) {
            return AudioAttributesImplBaseParcelizer();
        }
        if (!(p0 instanceof findValueInstantiator)) {
            throw new RenewEligibleCreator();
        }
        releaseBuffers releasebuffersMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        findValueInstantiator findvalueinstantiator = (findValueInstantiator) p0;
        if (releasebuffersMediaBrowserCompatItemReceiver.MediaMetadataCompat() != findvalueinstantiator.getIconCompatParcelizer()) {
            releasebuffersMediaBrowserCompatItemReceiver.write(findvalueinstantiator.getIconCompatParcelizer());
        }
        if (!findAutoDetectVisibility.AudioAttributesCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(), findvalueinstantiator.getWrite())) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(findvalueinstantiator.getWrite());
        }
        if (releasebuffersMediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem() != findvalueinstantiator.getRemoteActionCompatParcelizer()) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(findvalueinstantiator.getRemoteActionCompatParcelizer());
        }
        if (!findCreatorBinding.IconCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer(), findvalueinstantiator.getAudioAttributesCompatParcelizer())) {
            releasebuffersMediaBrowserCompatItemReceiver.IconCompatParcelizer(findvalueinstantiator.getAudioAttributesCompatParcelizer());
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.getOnAddQueueItem(), findvalueinstantiator.getRead())) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(findvalueinstantiator.getRead());
        }
        return releasebuffersMediaBrowserCompatItemReceiver;
    }

    static /* synthetic */ releaseBuffers write$default(findRenameByField findrenamebyfield, Instantiatable instantiatable, findViews findviews, float f, switchAndReturnNext switchandreturnnext, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = findSetterInfo.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return findrenamebyfield.write(instantiatable, findviews, f, switchandreturnnext, i, i2);
    }

    private final releaseBuffers write(Instantiatable p0, findViews p1, float p2, switchAndReturnNext p3, int p4, int p5) {
        releaseBuffers releasebuffersRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p1);
        if (p0 != null) {
            p0.RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(), releasebuffersRemoteActionCompatParcelizer, p2);
        } else {
            if (releasebuffersRemoteActionCompatParcelizer.getWrite() != null) {
                releasebuffersRemoteActionCompatParcelizer.read((Shader) null);
            }
            if (!switchToNext.RemoteActionCompatParcelizer(releasebuffersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), switchToNext.INSTANCE.AudioAttributesCompatParcelizer())) {
                releasebuffersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(switchToNext.INSTANCE.AudioAttributesCompatParcelizer());
            }
            if (releasebuffersRemoteActionCompatParcelizer.write() != p2) {
                releasebuffersRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p2);
            }
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasebuffersRemoteActionCompatParcelizer.getIconCompatParcelizer(), p3)) {
            releasebuffersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p3);
        }
        if (!createInstance.IconCompatParcelizer(releasebuffersRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer(), p4)) {
            releasebuffersRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p4);
        }
        if (!TextBuffer.read(releasebuffersRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), p5)) {
            releasebuffersRemoteActionCompatParcelizer.read(p5);
        }
        return releasebuffersRemoteActionCompatParcelizer;
    }

    static /* synthetic */ releaseBuffers read$default(findRenameByField findrenamebyfield, long j, findViews findviews, float f, switchAndReturnNext switchandreturnnext, int i, int i2, int i3, Object obj) {
        return findrenamebyfield.read(j, findviews, f, switchandreturnnext, i, (i3 & 32) != 0 ? findSetterInfo.INSTANCE.AudioAttributesCompatParcelizer() : i2);
    }

    private final releaseBuffers read(long p0, findViews p1, float p2, switchAndReturnNext p3, int p4, int p5) {
        releaseBuffers releasebuffersRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p1);
        long jWrite = write(p0, p2);
        if (!switchToNext.RemoteActionCompatParcelizer(releasebuffersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), jWrite)) {
            releasebuffersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jWrite);
        }
        if (releasebuffersRemoteActionCompatParcelizer.getWrite() != null) {
            releasebuffersRemoteActionCompatParcelizer.read((Shader) null);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasebuffersRemoteActionCompatParcelizer.getIconCompatParcelizer(), p3)) {
            releasebuffersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p3);
        }
        if (!createInstance.IconCompatParcelizer(releasebuffersRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer(), p4)) {
            releasebuffersRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p4);
        }
        if (!TextBuffer.read(releasebuffersRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), p5)) {
            releasebuffersRemoteActionCompatParcelizer.read(p5);
        }
        return releasebuffersRemoteActionCompatParcelizer;
    }

    static /* synthetic */ releaseBuffers IconCompatParcelizer$default(findRenameByField findrenamebyfield, long j, float f, float f2, int i, int i2, setCurrentLength setcurrentlength, float f3, switchAndReturnNext switchandreturnnext, int i3, int i4, int i5, Object obj) {
        return findrenamebyfield.IconCompatParcelizer(j, f, f2, i, i2, setcurrentlength, f3, switchandreturnnext, i3, (i5 & 512) != 0 ? findSetterInfo.INSTANCE.AudioAttributesCompatParcelizer() : i4);
    }

    private final releaseBuffers IconCompatParcelizer(long p0, float p1, float p2, int p3, int p4, setCurrentLength p5, float p6, switchAndReturnNext p7, int p8, int p9) {
        releaseBuffers releasebuffersMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        long jWrite = write(p0, p6);
        if (!switchToNext.RemoteActionCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(), jWrite)) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(jWrite);
        }
        if (releasebuffersMediaBrowserCompatItemReceiver.getWrite() != null) {
            releasebuffersMediaBrowserCompatItemReceiver.read((Shader) null);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.getIconCompatParcelizer(), p7)) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p7);
        }
        if (!createInstance.IconCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), p8)) {
            releasebuffersMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(p8);
        }
        if (releasebuffersMediaBrowserCompatItemReceiver.MediaMetadataCompat() != p1) {
            releasebuffersMediaBrowserCompatItemReceiver.write(p1);
        }
        if (releasebuffersMediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem() != p2) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p2);
        }
        if (!findAutoDetectVisibility.AudioAttributesCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(), p3)) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p3);
        }
        if (!findCreatorBinding.IconCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer(), p4)) {
            releasebuffersMediaBrowserCompatItemReceiver.IconCompatParcelizer(p4);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.getOnAddQueueItem(), p5)) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p5);
        }
        if (!TextBuffer.read(releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(), p9)) {
            releasebuffersMediaBrowserCompatItemReceiver.read(p9);
        }
        return releasebuffersMediaBrowserCompatItemReceiver;
    }

    static /* synthetic */ releaseBuffers RemoteActionCompatParcelizer$default(findRenameByField findrenamebyfield, Instantiatable instantiatable, float f, float f2, int i, int i2, setCurrentLength setcurrentlength, float f3, switchAndReturnNext switchandreturnnext, int i3, int i4, int i5, Object obj) {
        return findrenamebyfield.RemoteActionCompatParcelizer(instantiatable, f, f2, i, i2, setcurrentlength, f3, switchandreturnnext, i3, (i5 & 512) != 0 ? findSetterInfo.INSTANCE.AudioAttributesCompatParcelizer() : i4);
    }

    private final releaseBuffers RemoteActionCompatParcelizer(Instantiatable p0, float p1, float p2, int p3, int p4, setCurrentLength p5, float p6, switchAndReturnNext p7, int p8, int p9) {
        releaseBuffers releasebuffersMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (p0 != null) {
            p0.RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(), releasebuffersMediaBrowserCompatItemReceiver, p6);
        } else if (releasebuffersMediaBrowserCompatItemReceiver.write() != p6) {
            releasebuffersMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(p6);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.getIconCompatParcelizer(), p7)) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p7);
        }
        if (!createInstance.IconCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), p8)) {
            releasebuffersMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(p8);
        }
        if (releasebuffersMediaBrowserCompatItemReceiver.MediaMetadataCompat() != p1) {
            releasebuffersMediaBrowserCompatItemReceiver.write(p1);
        }
        if (releasebuffersMediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem() != p2) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p2);
        }
        if (!findAutoDetectVisibility.AudioAttributesCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(), p3)) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p3);
        }
        if (!findCreatorBinding.IconCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer(), p4)) {
            releasebuffersMediaBrowserCompatItemReceiver.IconCompatParcelizer(p4);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasebuffersMediaBrowserCompatItemReceiver.getOnAddQueueItem(), p5)) {
            releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(p5);
        }
        if (!TextBuffer.read(releasebuffersMediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(), p9)) {
            releasebuffersMediaBrowserCompatItemReceiver.read(p9);
        }
        return releasebuffersMediaBrowserCompatItemReceiver;
    }

    private final long write(long j, float f) {
        return f == 1.0f ? j : switchToNext.AudioAttributesCompatParcelizer$default(j, switchToNext.RemoteActionCompatParcelizer(j) * f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u0010\u0010\u001fR\"\u0010\u0012\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f\"\u0004\b\u0010\u0010#R\"\u0010 \u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010$\u001a\u0004\b \u0010\u0011\"\u0004\b\u000e\u0010%R\"\u0010\u0010\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010\u0013\"\u0004\b\u0012\u0010("}, d2 = {"Lo/findRenameByField$write;", "", "Lo/bufferMapProperty;", "p0", "Lo/tryToResolveUnresolved;", "p1", "Lo/JsonParserDelegate;", "p2", "Lo/calloc;", "p3", "<init>", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/JsonParserDelegate;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "()Lo/bufferMapProperty;", "AudioAttributesCompatParcelizer", "()Lo/tryToResolveUnresolved;", "IconCompatParcelizer", "()Lo/JsonParserDelegate;", "RemoteActionCompatParcelizer", "()J", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/bufferMapProperty;", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/bufferMapProperty;)V", "read", "Lo/tryToResolveUnresolved;", "MediaBrowserCompatItemReceiver", "(Lo/tryToResolveUnresolved;)V", "Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;)V", "J", "AudioAttributesImplBaseParcelizer", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class write {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private bufferMapProperty write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private long IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private tryToResolveUnresolved RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private JsonParserDelegate read;

        private write(bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved, JsonParserDelegate jsonParserDelegate, long j) {
            this.write = buffermapproperty;
            this.RemoteActionCompatParcelizer = trytoresolveunresolved;
            this.read = jsonParserDelegate;
            this.IconCompatParcelizer = j;
        }

        public /* synthetic */ write(bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved, findUnwrappingNameTransformer findunwrappingnametransformer, long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? findSerializationSortAlphabetically.AudioAttributesCompatParcelizer() : buffermapproperty, (i & 2) != 0 ? tryToResolveUnresolved.write : trytoresolveunresolved, (i & 4) != 0 ? findUnwrappingNameTransformer.INSTANCE : findunwrappingnametransformer, (i & 8) != 0 ? calloc.INSTANCE.AudioAttributesCompatParcelizer() : j, null);
        }

        public final void IconCompatParcelizer(bufferMapProperty buffermapproperty) {
            this.write = buffermapproperty;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final bufferMapProperty getWrite() {
            return this.write;
        }

        public final void IconCompatParcelizer(tryToResolveUnresolved trytoresolveunresolved) {
            this.RemoteActionCompatParcelizer = trytoresolveunresolved;
        }

        public final tryToResolveUnresolved MediaBrowserCompatItemReceiver() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(JsonParserDelegate jsonParserDelegate) {
            this.read = jsonParserDelegate;
        }

        public final JsonParserDelegate read() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
        public final long getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void RemoteActionCompatParcelizer(long j) {
            this.IconCompatParcelizer = j;
        }

        public /* synthetic */ write(bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved, JsonParserDelegate jsonParserDelegate, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(buffermapproperty, trytoresolveunresolved, jsonParserDelegate, j);
        }

        public final bufferMapProperty write() {
            return this.write;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final tryToResolveUnresolved getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final JsonParserDelegate getRead() {
            return this.read;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, writeVar.write) && this.RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, writeVar.read) && calloc.RemoteActionCompatParcelizer(this.IconCompatParcelizer, writeVar.IconCompatParcelizer);
        }

        public final int hashCode() {
            return (((((this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + calloc.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("write(write=");
            sb.append(this.write);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", read=");
            sb.append(this.read);
            sb.append(", IconCompatParcelizer=");
            sb.append((Object) calloc.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer));
            sb.append(')');
            return sb.toString();
        }
    }
}
