package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._parseIntValue;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\b\u0010\u0016"}, d2 = {"Lo/setEncoding;", "", "p0", "", "p1", "p2", "", "Lo/JsonGeneratorImpl;", "write", "(Lo/setEncoding;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;", "Lo/releaseBase64Buffer;", "RemoteActionCompatParcelizer", "(Lo/releaseBase64Buffer;)Ljava/util/List;", "read", "(Lo/releaseBase64Buffer;ILjava/lang/Object;)Ljava/util/List;", "Lo/releaseTokenBuffer;", "Lkotlin/Function1;", "", "Lo/_matchToken2;", "AudioAttributesCompatParcelizer", "(Lo/releaseTokenBuffer;Lo/getAnswerMap;)Lo/_matchToken2;", "Lo/convertNumberToLong;", "(Lo/releaseTokenBuffer;Lo/convertNumberToLong;)Ljava/lang/Integer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isDup {
    public static /* synthetic */ List write$default(setEncoding setencoding, Object obj, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = setencoding.getAudioAttributesImplApi26Parcelizer();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return write(setencoding, obj, i, num);
    }

    public static final List<JsonGeneratorImpl> write(setEncoding setencoding, Object obj, int i, Integer num) {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iMediaBrowserCompatCustomActionResultReceiver;
        Object objIconCompatParcelizer;
        if (!setencoding.getWrite() && setencoding.MediaBrowserCompatCustomActionResultReceiver() != 0) {
            _skipColon2 _skipcolon2 = new _skipColon2(setencoding);
            if (num != null) {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = num.intValue();
            } else {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = setencoding.getOnCommand() < 0 ? setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i) : setencoding.getOnCommand();
            }
            if (obj == null) {
                obj = Integer.valueOf(setencoding.MediaBrowserCompatItemReceiver(i));
            }
            if (setencoding.MediaBrowserCompatSearchResultReceiver(i)) {
                iMediaBrowserCompatCustomActionResultReceiver = setencoding.MediaBrowserCompatCustomActionResultReceiver(i);
            } else {
                int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver >= 0 ? setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) : iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                iMediaBrowserCompatCustomActionResultReceiver = setencoding.MediaBrowserCompatCustomActionResultReceiver(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                int i2 = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
                i = i2;
            }
            while (i >= 0) {
                if (setencoding.AudioAttributesImplApi26Parcelizer(i)) {
                    objIconCompatParcelizer = setencoding.AudioAttributesImplApi21Parcelizer(i);
                } else {
                    objIconCompatParcelizer = _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
                }
                _skipcolon2.RemoteActionCompatParcelizer(iMediaBrowserCompatCustomActionResultReceiver, objIconCompatParcelizer, setencoding.onPlay(i), obj);
                obj = setencoding.read(i);
                if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver >= 0) {
                    int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver3 = setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    iMediaBrowserCompatCustomActionResultReceiver = setencoding.MediaBrowserCompatCustomActionResultReceiver(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    int i3 = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver3;
                    i = i3;
                } else {
                    i = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
            }
            return _skipcolon2.RemoteActionCompatParcelizer();
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public static final List<JsonGeneratorImpl> RemoteActionCompatParcelizer(releaseBase64Buffer releasebase64buffer) {
        Object objIconCompatParcelizer;
        if (!releasebase64buffer.getAudioAttributesCompatParcelizer() && releasebase64buffer.getAudioAttributesImplBaseParcelizer() != 0) {
            _parseName2 _parsename2 = new _parseName2(releasebase64buffer);
            int mediaDescriptionCompat = releasebase64buffer.getMediaDescriptionCompat();
            Object objValueOf = Integer.valueOf(releasebase64buffer.onMediaButtonEvent());
            while (mediaDescriptionCompat >= 0) {
                if (releasebase64buffer.AudioAttributesImplApi26Parcelizer(mediaDescriptionCompat)) {
                    objIconCompatParcelizer = releasebase64buffer.AudioAttributesImplApi21Parcelizer(mediaDescriptionCompat);
                } else {
                    objIconCompatParcelizer = _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
                }
                _parsename2.RemoteActionCompatParcelizer(releasebase64buffer.read(mediaDescriptionCompat), objIconCompatParcelizer, releasebase64buffer.getRatingCompat().RemoteActionCompatParcelizer(mediaDescriptionCompat), objValueOf);
                objValueOf = releasebase64buffer.IconCompatParcelizer(mediaDescriptionCompat);
                mediaDescriptionCompat = releasebase64buffer.RatingCompat(mediaDescriptionCompat);
            }
            return _parsename2.RemoteActionCompatParcelizer();
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public static final List<JsonGeneratorImpl> read(releaseBase64Buffer releasebase64buffer, int i, Object obj) {
        Object objIconCompatParcelizer;
        _parseName2 _parsename2 = new _parseName2(releasebase64buffer);
        int iRatingCompat = releasebase64buffer.RatingCompat(i);
        _parseSlowFloat _parseslowfloatIconCompatParcelizer = releasebase64buffer.IconCompatParcelizer(i);
        while (i >= 0) {
            if (releasebase64buffer.AudioAttributesImplApi26Parcelizer(i)) {
                objIconCompatParcelizer = releasebase64buffer.AudioAttributesImplApi21Parcelizer(i);
            } else {
                objIconCompatParcelizer = _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
            }
            _parsename2.RemoteActionCompatParcelizer(releasebase64buffer.read(i), objIconCompatParcelizer, releasebase64buffer.getRatingCompat().RemoteActionCompatParcelizer(i), obj);
            if (iRatingCompat >= 0) {
                _parseSlowFloat _parseslowfloat = _parseslowfloatIconCompatParcelizer;
                _parseslowfloatIconCompatParcelizer = releasebase64buffer.IconCompatParcelizer(iRatingCompat);
                i = iRatingCompat;
                iRatingCompat = releasebase64buffer.RatingCompat(iRatingCompat);
                obj = _parseslowfloat;
            } else {
                i = iRatingCompat;
                obj = _parseslowfloatIconCompatParcelizer;
            }
        }
        return _parsename2.RemoteActionCompatParcelizer();
    }

    private static final Integer write(releaseBase64Buffer releasebase64buffer, convertNumberToLong convertnumbertolong, int i, int i2) {
        Integer numWrite;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iMediaBrowserCompatCustomActionResultReceiver = releasebase64buffer.MediaBrowserCompatCustomActionResultReceiver(i) + i;
            if (releasebase64buffer.MediaBrowserCompatItemReceiver(i) && releasebase64buffer.read(i) == 206 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(releasebase64buffer.AudioAttributesImplApi21Parcelizer(i), _validJsonValueList.MediaBrowserCompatItemReceiver())) {
                Object objIconCompatParcelizer = releasebase64buffer.IconCompatParcelizer(i, 0);
                constructReadConstrainedTextBuffer constructreadconstrainedtextbuffer = objIconCompatParcelizer instanceof constructReadConstrainedTextBuffer ? (constructReadConstrainedTextBuffer) objIconCompatParcelizer : null;
                allocReadIOBuffer write = constructreadconstrainedtextbuffer != null ? constructreadconstrainedtextbuffer.getWrite() : null;
                _parseIntValue.read readVar = write instanceof _parseIntValue.read ? (_parseIntValue.read) write : null;
                if (readVar != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readVar.getAudioAttributesCompatParcelizer(), convertnumbertolong)) {
                    return Integer.valueOf(i);
                }
            }
            if (releasebase64buffer.AudioAttributesCompatParcelizer(i) && (numWrite = write(releasebase64buffer, convertnumbertolong, i + 1, iMediaBrowserCompatCustomActionResultReceiver)) != null) {
                return Integer.valueOf(numWrite.intValue());
            }
            i = iMediaBrowserCompatCustomActionResultReceiver;
        }
    }

    public static final _matchToken2 AudioAttributesCompatParcelizer(releaseTokenBuffer releasetokenbuffer, getAnswerMap<Object, Boolean> getanswermap) {
        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = releasetokenbuffer.MediaBrowserCompatMediaItem();
        for (int i = 0; i < releasetokenbuffer.getRemoteActionCompatParcelizer(); i++) {
            try {
                if (releasebase64bufferMediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer(i) && getanswermap.invoke(releasebase64bufferMediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver(i)).booleanValue()) {
                    return new _matchToken2(i, null);
                }
                int iHandleMediaPlayPauseIfPendingOnHandler = releasebase64bufferMediaBrowserCompatMediaItem.handleMediaPlayPauseIfPendingOnHandler(i);
                for (int i2 = 0; i2 < iHandleMediaPlayPauseIfPendingOnHandler; i2++) {
                    if (getanswermap.invoke(releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer(i, i2)).booleanValue()) {
                        return new _matchToken2(i, Integer.valueOf(i2));
                    }
                }
            } finally {
                releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
            }
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        return null;
    }

    public static final Integer write(releaseTokenBuffer releasetokenbuffer, convertNumberToLong convertnumbertolong) {
        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = releasetokenbuffer.MediaBrowserCompatMediaItem();
        try {
            return write(releasebase64bufferMediaBrowserCompatMediaItem, convertnumbertolong, 0, releasebase64bufferMediaBrowserCompatMediaItem.getAudioAttributesImplBaseParcelizer());
        } finally {
            releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
        }
    }
}
