package kotlin;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH ¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u000eH ¢\u0006\u0004\b\t\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0010¢\u0006\u0004\b\t\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u0013\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u001bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020 H ¢\u0006\u0004\b\t\u0010!J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020 H ¢\u0006\u0004\b\u000f\u0010!J+\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\b\u001a\u00020\"2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030#H ¢\u0006\u0004\b\u0019\u0010$J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0005\u001a\u00020 H\u0010¢\u0006\u0004\b\u001f\u0010%J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u001f\u0010\u0014J\u001d\u0010\u000f\u001a\u00020&2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\u000f\u0010'R\u0018\u0010\t\u001a\u00060(j\u0002`)8!X \u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010\u001f\u001a\u00020,8!X \u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010-R\u0014\u0010\u000f\u001a\u00020,8!X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010-R\u0014\u0010\u0019\u001a\u00020,8!X \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010-R\u0014\u0010\u0013\u001a\u00020,8!X \u0004¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u0002038'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00104R\u0016\u0010\u001c\u001a\u0004\u0018\u0001068!X \u0004¢\u0006\u0006\u001a\u0004\b7\u00108"}, d2 = {"Lo/convertNumberToLong;", "", "<init>", "()V", "Lo/_reportMissingRootWS;", "p0", "Lkotlin/Function0;", "", "p1", "IconCompatParcelizer", "(Lo/_reportMissingRootWS;Lo/MagicModuleSubmissionRequestBody;)V", "Lo/isResourceManaged;", "p2", "Lo/setButtonDrawable;", "Lo/rawReference;", "write", "(Lo/_reportMissingRootWS;Lo/isResourceManaged;Lo/MagicModuleSubmissionRequestBody;)Lo/setButtonDrawable;", "(Lo/_reportMissingRootWS;Lo/isResourceManaged;Lo/setButtonDrawable;)Lo/setButtonDrawable;", "(Lo/rawReference;)V", "AudioAttributesCompatParcelizer", "(Lo/_reportMissingRootWS;)V", "", "Lo/JsonReadContext;", "(Ljava/util/Set;)V", "Lo/_handleUnrecognizedCharacterEscape;", "RemoteActionCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;)V", "Lo/hexToChar;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/hexToChar;", "MediaBrowserCompatSearchResultReceiver", "read", "Lo/getFilter;", "(Lo/getFilter;)V", "Lo/checkValue;", "Lo/_closeInput;", "(Lo/getFilter;Lo/checkValue;Lo/_closeInput;)V", "(Lo/getFilter;)Lo/checkValue;", "Lo/_contentReference;", "(Lo/getCreatedOnDateMs;)Lo/_contentReference;", "", "Lo/CompositeKeyHashCode;", "AudioAttributesImplBaseParcelizer", "()J", "", "()Z", "MediaDescriptionCompat", "Lo/resetFloat;", "MediaMetadataCompat", "()Lo/resetFloat;", "MediaBrowserCompatItemReceiver", "Lo/CurrentQuery;", "()Lo/CurrentQuery;", "AudioAttributesImplApi26Parcelizer", "Lo/createChildArrayContext;", "AudioAttributesImplApi21Parcelizer", "()Lo/createChildArrayContext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class convertNumberToLong {
    public void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape p0) {
    }

    public abstract void AudioAttributesCompatParcelizer(_reportMissingRootWS p0);

    public abstract boolean AudioAttributesCompatParcelizer();

    public abstract createChildArrayContext AudioAttributesImplApi21Parcelizer();

    public abstract long AudioAttributesImplBaseParcelizer();

    public void IconCompatParcelizer(Set<JsonReadContext> p0) {
    }

    public abstract void IconCompatParcelizer(_reportMissingRootWS p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1);

    public abstract void IconCompatParcelizer(getFilter p0);

    public abstract void IconCompatParcelizer(rawReference p0);

    public abstract boolean IconCompatParcelizer();

    public abstract CurrentQuery MediaBrowserCompatItemReceiver();

    public void MediaBrowserCompatSearchResultReceiver() {
    }

    public abstract boolean MediaDescriptionCompat();

    public resetFloat MediaMetadataCompat() {
        return null;
    }

    public void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape p0) {
    }

    public abstract void RemoteActionCompatParcelizer(_reportMissingRootWS p0);

    public abstract void RemoteActionCompatParcelizer(getFilter p0, checkValue p1, _closeInput<?> p2);

    public checkValue read(getFilter p0) {
        return null;
    }

    public void read() {
    }

    public abstract void read(_reportMissingRootWS p0);

    public abstract _contentReference write(getCreatedOnDateMs<getShowPopup> p0);

    public abstract setButtonDrawable<rawReference> write(_reportMissingRootWS p0, isResourceManaged p1, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p2);

    public abstract setButtonDrawable<rawReference> write(_reportMissingRootWS p0, isResourceManaged p1, setButtonDrawable<rawReference> p2);

    public abstract void write(getFilter p0);

    public abstract boolean write();

    public hexToChar MediaBrowserCompatCustomActionResultReceiver() {
        return createChildObjectContext.read;
    }
}
