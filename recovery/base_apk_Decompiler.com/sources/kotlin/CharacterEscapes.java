package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00028\u0000H ¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\n\u0010\tJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000b\u0010\tJ3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0010¢\u0006\u0004\b\u000b\u0010\u000eJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/CharacterEscapes;", "T", "Lo/getTokenColumnNr;", "Lkotlin/Function0;", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V", "Lo/ContentReference;", "write", "(Ljava/lang/Object;)Lo/ContentReference;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/_leading3;", "p1", "(Lo/ContentReference;Lo/_leading3;)Lo/_leading3;", "read", "(Lo/ContentReference;)Lo/_leading3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CharacterEscapes<T> extends getTokenColumnNr<T> {
    public abstract ContentReference<T> write(T p0);

    public CharacterEscapes(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        super(getcreatedondatems, null);
    }

    public final ContentReference<T> AudioAttributesCompatParcelizer(T p0) {
        return write(p0);
    }

    public final ContentReference<T> IconCompatParcelizer(T p0) {
        return write(p0).AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.getTokenColumnNr
    public _leading3<T> IconCompatParcelizer(ContentReference<T> p0, _leading3<T> p1) {
        FilteringParserDelegate filteringParserDelegate = null;
        if (p1 instanceof FilteringParserDelegate) {
            if (p0.getAudioAttributesImplApi21Parcelizer()) {
                filteringParserDelegate = (FilteringParserDelegate) p1;
                filteringParserDelegate.RemoteActionCompatParcelizer().write(p0.RemoteActionCompatParcelizer());
            }
            filteringParserDelegate = filteringParserDelegate;
        } else if (p1 instanceof parseFloat) {
            if (p0.AudioAttributesImplApi26Parcelizer()) {
                parseFloat parsefloat = (parseFloat) p1;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.RemoteActionCompatParcelizer(), parsefloat.IconCompatParcelizer())) {
                    filteringParserDelegate = parsefloat;
                }
            }
            filteringParserDelegate = filteringParserDelegate;
        } else if (p1 instanceof _reportInvalidEOFInValue) {
            _reportInvalidEOFInValue _reportinvalideofinvalue = (_reportInvalidEOFInValue) p1;
            if (p0.AudioAttributesCompatParcelizer() == _reportinvalideofinvalue.read()) {
                filteringParserDelegate = _reportinvalideofinvalue;
            }
            filteringParserDelegate = filteringParserDelegate;
        }
        return filteringParserDelegate == null ? read(p0) : filteringParserDelegate;
    }

    private final _leading3<T> read(ContentReference<T> p0) {
        if (!p0.getAudioAttributesImplApi21Parcelizer()) {
            return p0.AudioAttributesCompatParcelizer() != null ? new _reportInvalidEOFInValue(p0.AudioAttributesCompatParcelizer()) : p0.MediaBrowserCompatItemReceiver() != null ? new FilteringParserDelegate(p0.MediaBrowserCompatItemReceiver()) : new parseFloat(p0.RemoteActionCompatParcelizer());
        }
        InputAccessor<T> inputAccessorMediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver();
        if (inputAccessorMediaBrowserCompatItemReceiver == null) {
            T tAudioAttributesImplBaseParcelizer = p0.AudioAttributesImplBaseParcelizer();
            quoteAsUTF8<T> quoteasutf8IconCompatParcelizer = p0.IconCompatParcelizer();
            if (quoteasutf8IconCompatParcelizer == null) {
                quoteasutf8IconCompatParcelizer = _qbuf.RemoteActionCompatParcelizer();
            }
            inputAccessorMediaBrowserCompatItemReceiver = _qbuf.RemoteActionCompatParcelizer(tAudioAttributesImplBaseParcelizer, quoteasutf8IconCompatParcelizer);
        }
        return new FilteringParserDelegate(inputAccessorMediaBrowserCompatItemReceiver);
    }
}
