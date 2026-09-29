package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ9\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\b\u0010\u0015J9\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017Jb\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b\b\u0010$JJ\u0010%\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b%\u0010&JB\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b\u0016\u0010(Jb\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\r\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020*2\u0006\u0010\u0013\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b\b\u0010,J\\\u00100\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020-2\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020.2\b\u0010\u001c\u001a\u0004\u0018\u00010/2\u0006\u0010\u001d\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b0\u00101J\\\u00100\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020.2\b\u0010\u001c\u001a\u0004\u0018\u00010/2\u0006\u0010\u001d\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b0\u00102JB\u0010%\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002032\u0006\u0010\r\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b%\u00104JB\u0010%\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002032\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b%\u00105JJ\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020-2\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b\b\u00106JJ\u00107\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b7\u00108JR\u00107\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020-2\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002092\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b7\u0010:JR\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002092\u0006\u0010\u0014\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b\u0016\u0010;J\u0014\u00100\u001a\u00020=*\u00020<H\u0096\u0001¢\u0006\u0004\b0\u0010>J\u0014\u0010@\u001a\u00020=*\u00020?H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u0014\u0010B\u001a\u00020<*\u00020=H\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0014\u0010\b\u001a\u00020<*\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\b\u0010DJ\u0014\u0010E\u001a\u00020<*\u00020?H\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u0014\u0010B\u001a\u00020G*\u00020\u000fH\u0096\u0001¢\u0006\u0004\bB\u0010HJ\u0014\u0010%\u001a\u00020\u0019*\u00020<H\u0096\u0001¢\u0006\u0004\b%\u0010DJ\u0014\u0010I\u001a\u00020\u0019*\u00020?H\u0096\u0001¢\u0006\u0004\bI\u0010FJ\u0014\u0010J\u001a\u00020\u000f*\u00020GH\u0096\u0001¢\u0006\u0004\bJ\u0010HJ\u0014\u0010\u0016\u001a\u00020?*\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u0016\u0010KJ\u0014\u00107\u001a\u00020?*\u00020<H\u0096\u0001¢\u0006\u0004\b7\u0010KR\u0011\u00100\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b7\u0010LR\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010MR\u0014\u0010%\u001a\u00020\u001b8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010\u0016\u001a\u00020\u00198\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u0010PR\u0014\u0010\b\u001a\u00020Q8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010RR\u0014\u0010S\u001a\u00020\u00198\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010PR\u0014\u0010V\u001a\u00020T8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010UR\u0014\u0010N\u001a\u00020\u000f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010O"}, d2 = {"Lo/_readMapAndClose;", "Lo/findSetterInfo;", "Lo/findSerializer;", "Lo/findRenameByField;", "p0", "<init>", "(Lo/findRenameByField;)V", "", "write", "()V", "Lo/addKeySerializers;", "Lo/JsonParserDelegate;", "Lo/hasAnyGetter;", "p1", "(Lo/addKeySerializers;Lo/JsonParserDelegate;Lo/hasAnyGetter;)V", "Lo/calloc;", "Lo/_bindAndClose;", "p2", "Lo/_handleOddName$IconCompatParcelizer;", "p3", "p4", "(Lo/JsonParserDelegate;JLo/_bindAndClose;Lo/_handleOddName$IconCompatParcelizer;Lo/hasAnyGetter;)V", "RemoteActionCompatParcelizer", "(Lo/JsonParserDelegate;JLo/_bindAndClose;Lo/addKeySerializers;Lo/hasAnyGetter;)V", "Lo/switchToNext;", "", "", "Lo/getReferencedType;", "p5", "p6", "Lo/findViews;", "p7", "Lo/switchAndReturnNext;", "p8", "Lo/createInstance;", "p9", "(JFFZJJFLo/findViews;Lo/switchAndReturnNext;I)V", "AudioAttributesCompatParcelizer", "(JFJFLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/unshare;", "(Lo/unshare;JFLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/hasReferringProperties;", "Lo/getKey;", "Lo/TextBuffer;", "(Lo/unshare;JJJJFLo/findViews;Lo/switchAndReturnNext;II)V", "Lo/Instantiatable;", "Lo/findAutoDetectVisibility;", "Lo/setCurrentLength;", "IconCompatParcelizer", "(Lo/Instantiatable;JJFILo/setCurrentLength;FLo/switchAndReturnNext;I)V", "(JJJFILo/setCurrentLength;FLo/switchAndReturnNext;I)V", "Lo/removeSoftRefsClearedByGc;", "(Lo/removeSoftRefsClearedByGc;Lo/Instantiatable;FLo/findViews;Lo/switchAndReturnNext;I)V", "(Lo/removeSoftRefsClearedByGc;JFLo/findViews;Lo/switchAndReturnNext;I)V", "(Lo/Instantiatable;JJFLo/findViews;Lo/switchAndReturnNext;I)V", "read", "(JJJFLo/findViews;Lo/switchAndReturnNext;I)V", "Lo/TypeReference;", "(Lo/Instantiatable;JJJFLo/findViews;Lo/switchAndReturnNext;I)V", "(JJJJLo/findViews;FLo/switchAndReturnNext;I)V", "Lo/assignParameter;", "", "(F)I", "Lo/ReadableObjectIdReferring;", "a_", "(J)I", "b_", "(I)F", "(F)F", "e_", "(J)F", "Lo/handleIdValue;", "(J)J", "c_", "d_", "(F)J", "Lo/findRenameByField;", "Lo/addKeySerializers;", "AudioAttributesImplApi26Parcelizer", "()J", "()F", "Lo/findSerializationTyping;", "()Lo/findSerializationTyping;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _readMapAndClose implements findSerializer {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private addKeySerializers read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final findRenameByField IconCompatParcelizer;

    public _readMapAndClose(findRenameByField findrenamebyfield) {
        this.IconCompatParcelizer = findrenamebyfield;
    }

    public /* synthetic */ _readMapAndClose(findRenameByField findrenamebyfield, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new findRenameByField() : findrenamebyfield);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // kotlin.findSerializer
    public final void write() {
        JsonParserDelegate jsonParserDelegateIconCompatParcelizer = getIconCompatParcelizer().IconCompatParcelizer();
        addKeySerializers addkeyserializers = this.read;
        if (addkeyserializers != null) {
            addKeySerializers addkeyserializers2 = addkeyserializers;
            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = _verifyNoTrailingTokens.write(addkeyserializers2);
            if (iconCompatParcelizerWrite == 0) {
                _bindAndClose _bindandcloseWrite = collectLongDefaults.write((Module) addkeyserializers2, _bind.write(4));
                if (_bindandcloseWrite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() == addkeyserializers.getRead()) {
                    _bindandcloseWrite = _bindandcloseWrite.getRead();
                    toMagicModuleMetaRepoModel.write(_bindandcloseWrite);
                }
                _bindandcloseWrite.write(jsonParserDelegateIconCompatParcelizer, getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer());
                return;
            }
            int iWrite = _bind.write(4);
            UTF32Reader uTF32Reader = null;
            while (iconCompatParcelizerWrite != 0) {
                if (iconCompatParcelizerWrite instanceof addKeySerializers) {
                    write((addKeySerializers) iconCompatParcelizerWrite, jsonParserDelegateIconCompatParcelizer, getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer());
                } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                    int i = 0;
                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                    while (iconCompatParcelizer != null) {
                        if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                            i++;
                            if (i == 1) {
                                iconCompatParcelizerWrite = iconCompatParcelizer;
                            } else {
                                if (uTF32Reader == null) {
                                    uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                }
                                if (iconCompatParcelizerWrite != 0) {
                                    if (uTF32Reader != null) {
                                        uTF32Reader.read(iconCompatParcelizerWrite);
                                    }
                                    iconCompatParcelizerWrite = 0;
                                }
                                if (uTF32Reader != null) {
                                    uTF32Reader.read(iconCompatParcelizer);
                                }
                            }
                        }
                        iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                        iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                    }
                    if (i != 1) {
                    }
                }
                iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
            }
            return;
        }
        reportWrongTokenException.write("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        throw new PlanDetailsCreator();
    }

    public final void write(addKeySerializers addkeyserializers, JsonParserDelegate jsonParserDelegate, hasAnyGetter hasanygetter) {
        _bindAndClose _bindandcloseWrite = collectLongDefaults.write((Module) addkeyserializers, _bind.write(4));
        _bindandcloseWrite.getIconCompatParcelizer().MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(jsonParserDelegate, SetterlessProperty.AudioAttributesCompatParcelizer(_bindandcloseWrite.write()), _bindandcloseWrite, addkeyserializers, hasanygetter);
    }

    public final void RemoteActionCompatParcelizer(JsonParserDelegate p0, long p1, _bindAndClose p2, addKeySerializers p3, hasAnyGetter p4) {
        addKeySerializers addkeyserializers = this.read;
        this.read = p3;
        findRenameByField findrenamebyfield = this.IconCompatParcelizer;
        tryToResolveUnresolved audioAttributesCompatParcelizer = p2.getAudioAttributesCompatParcelizer();
        bufferMapProperty buffermapproperty = findrenamebyfield.getIconCompatParcelizer().read();
        tryToResolveUnresolved trytoresolveunresolvedWrite = findrenamebyfield.getIconCompatParcelizer().write();
        JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findrenamebyfield.getIconCompatParcelizer().IconCompatParcelizer();
        long jAudioAttributesCompatParcelizer = findrenamebyfield.getIconCompatParcelizer().AudioAttributesCompatParcelizer();
        hasAnyGetter audioAttributesImplApi26Parcelizer = findrenamebyfield.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer();
        findSerializationTyping iconCompatParcelizer = findrenamebyfield.getIconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer(p2);
        iconCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        iconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        iconCompatParcelizer.IconCompatParcelizer(p1);
        iconCompatParcelizer.write(p4);
        p0.IconCompatParcelizer();
        try {
            p3.write(this);
            p0.AudioAttributesCompatParcelizer();
            findSerializationTyping iconCompatParcelizer2 = findrenamebyfield.getIconCompatParcelizer();
            iconCompatParcelizer2.AudioAttributesCompatParcelizer(buffermapproperty);
            iconCompatParcelizer2.AudioAttributesCompatParcelizer(trytoresolveunresolvedWrite);
            iconCompatParcelizer2.AudioAttributesCompatParcelizer(jsonParserDelegateIconCompatParcelizer);
            iconCompatParcelizer2.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            iconCompatParcelizer2.write(audioAttributesImplApi26Parcelizer);
            this.read = addkeyserializers;
        } catch (Throwable th) {
            p0.AudioAttributesCompatParcelizer();
            findSerializationTyping iconCompatParcelizer3 = findrenamebyfield.getIconCompatParcelizer();
            iconCompatParcelizer3.AudioAttributesCompatParcelizer(buffermapproperty);
            iconCompatParcelizer3.AudioAttributesCompatParcelizer(trytoresolveunresolvedWrite);
            iconCompatParcelizer3.AudioAttributesCompatParcelizer(jsonParserDelegateIconCompatParcelizer);
            iconCompatParcelizer3.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            iconCompatParcelizer3.write(audioAttributesImplApi26Parcelizer);
            throw th;
        }
    }

    public final void write(JsonParserDelegate p0, long p1, _bindAndClose p2, _handleOddName.IconCompatParcelizer p3, hasAnyGetter p4) {
        int iWrite = _bind.write(4);
        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = p3;
        UTF32Reader uTF32Reader = null;
        while (iconCompatParcelizerWrite != null) {
            if (iconCompatParcelizerWrite instanceof addKeySerializers) {
                RemoteActionCompatParcelizer(p0, p1, p2, (addKeySerializers) iconCompatParcelizerWrite, p4);
            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                int i = 0;
                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                        i++;
                        if (i == 1) {
                            iconCompatParcelizerWrite = iconCompatParcelizer;
                        } else {
                            if (uTF32Reader == null) {
                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                            }
                            if (iconCompatParcelizerWrite != null) {
                                if (uTF32Reader != null) {
                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                }
                                iconCompatParcelizerWrite = null;
                            }
                            if (uTF32Reader != null) {
                                uTF32Reader.read(iconCompatParcelizer);
                            }
                        }
                    }
                }
                if (i != 1) {
                }
            }
            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public _readMapAndClose() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kotlin.findSetterInfo
    public final void write(long p0, float p1, float p2, boolean p3, long p4, long p5, float p6, findViews p7, switchAndReturnNext p8, int p9) {
        this.IconCompatParcelizer.write(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override // kotlin.findSetterInfo
    public final void AudioAttributesCompatParcelizer(long p0, float p1, long p2, float p3, findViews p4, switchAndReturnNext p5, int p6) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // kotlin.findSetterInfo
    public final void write(unshare p0, long p1, long p2, long p3, long p4, float p5, findViews p6, switchAndReturnNext p7, int p8, int p9) {
        this.IconCompatParcelizer.write(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override // kotlin.findSetterInfo
    public final void RemoteActionCompatParcelizer(unshare p0, long p1, float p2, findViews p3, switchAndReturnNext p4, int p5) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0, p1, p2, p3, p4, p5);
    }

    @Override // kotlin.findSetterInfo
    public final void IconCompatParcelizer(Instantiatable p0, long p1, long p2, float p3, int p4, setCurrentLength p5, float p6, switchAndReturnNext p7, int p8) {
        this.IconCompatParcelizer.IconCompatParcelizer(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // kotlin.findSetterInfo
    public final void IconCompatParcelizer(long p0, long p1, long p2, float p3, int p4, setCurrentLength p5, float p6, switchAndReturnNext p7, int p8) {
        this.IconCompatParcelizer.IconCompatParcelizer(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // kotlin.findSetterInfo
    public final void AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc p0, Instantiatable p1, float p2, findViews p3, switchAndReturnNext p4, int p5) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2, p3, p4, p5);
    }

    @Override // kotlin.findSetterInfo
    public final void AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc p0, long p1, float p2, findViews p3, switchAndReturnNext p4, int p5) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2, p3, p4, p5);
    }

    @Override // kotlin.findSetterInfo
    public final void write(Instantiatable p0, long p1, long p2, float p3, findViews p4, switchAndReturnNext p5, int p6) {
        this.IconCompatParcelizer.write(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // kotlin.findSetterInfo
    public final void read(long p0, long p1, long p2, float p3, findViews p4, switchAndReturnNext p5, int p6) {
        this.IconCompatParcelizer.read(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // kotlin.findSetterInfo
    public final void read(Instantiatable p0, long p1, long p2, long p3, float p4, findViews p5, switchAndReturnNext p6, int p7) {
        this.IconCompatParcelizer.read(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override // kotlin.findSetterInfo
    public final void RemoteActionCompatParcelizer(long p0, long p1, long p2, long p3, findViews p4, float p5, switchAndReturnNext p6, int p7) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override // kotlin.findSetterInfo
    public final long AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getRead() {
        return this.IconCompatParcelizer.getRead();
    }

    @Override // kotlin.findSetterInfo
    /* JADX INFO: renamed from: read */
    public final findSerializationTyping getIconCompatParcelizer() {
        return this.IconCompatParcelizer.getIconCompatParcelizer();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer.getIconCompatParcelizer();
    }

    @Override // kotlin.findSetterInfo
    public final tryToResolveUnresolved RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findSetterInfo
    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.bufferMapProperty
    public final int a_(long j) {
        return this.IconCompatParcelizer.a_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final int IconCompatParcelizer(float f) {
        return this.IconCompatParcelizer.IconCompatParcelizer(f);
    }

    @Override // kotlin.getParameter
    public final float e_(long j) {
        return this.IconCompatParcelizer.e_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float write(float f) {
        return this.IconCompatParcelizer.write(f);
    }

    @Override // kotlin.bufferMapProperty
    public final float b_(int i) {
        return this.IconCompatParcelizer.b_(i);
    }

    @Override // kotlin.bufferMapProperty
    public final long b_(long j) {
        return this.IconCompatParcelizer.b_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float c_(long j) {
        return this.IconCompatParcelizer.c_(j);
    }

    @Override // kotlin.bufferMapProperty
    public final float AudioAttributesCompatParcelizer(float f) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(f);
    }

    @Override // kotlin.bufferMapProperty
    public final long d_(long j) {
        return this.IconCompatParcelizer.d_(j);
    }

    @Override // kotlin.getParameter
    public final long read(float f) {
        return this.IconCompatParcelizer.read(f);
    }

    @Override // kotlin.bufferMapProperty
    public final long RemoteActionCompatParcelizer(float f) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(f);
    }
}
