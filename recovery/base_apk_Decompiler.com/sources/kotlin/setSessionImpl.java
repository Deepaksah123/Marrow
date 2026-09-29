package kotlin;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.setSessionImpl;

/* JADX INFO: loaded from: classes.dex */
public final class setSessionImpl {

    /* JADX INFO: renamed from: o.setSessionImpl$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", "O", "Lo/StreamConstraintsException;", "Lo/_wrapError;", "read", "(Lo/StreamConstraintsException;)Lo/_wrapError;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<StreamConstraintsException, _wrapError> {
        final /* synthetic */ String $AudioAttributesCompatParcelizer;
        final /* synthetic */ r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 $IconCompatParcelizer;
        final /* synthetic */ accessaddObserverForBackInvoker<I, O> $RemoteActionCompatParcelizer;
        final /* synthetic */ parseDouble<getAnswerMap<O, getShowPopup>> $read;
        final /* synthetic */ onSkipToPrevious<I> $write;

        /* JADX INFO: renamed from: o.setSessionImpl$5$write */
        public static final class write implements _wrapError {
            final /* synthetic */ onSkipToPrevious IconCompatParcelizer;

            public write(onSkipToPrevious onskiptoprevious) {
                this.IconCompatParcelizer = onskiptoprevious;
            }

            @Override // kotlin._wrapError
            public final void RemoteActionCompatParcelizer() {
                this.IconCompatParcelizer.write();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final _wrapError invoke(StreamConstraintsException streamConstraintsException) {
            onSkipToPrevious<I> onskiptoprevious = this.$write;
            r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0 = this.$IconCompatParcelizer;
            String str = this.$AudioAttributesCompatParcelizer;
            accessaddObserverForBackInvoker<I, O> accessaddobserverforbackinvoker = this.$RemoteActionCompatParcelizer;
            final parseDouble<getAnswerMap<O, getShowPopup>> parsedouble = this.$read;
            onskiptoprevious.RemoteActionCompatParcelizer((r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<I>) r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.read(str, accessaddobserverforbackinvoker, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.MediaSessionCompatResultReceiverWrapper
                @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
                public final void IconCompatParcelizer(Object obj) {
                    setSessionImpl.AnonymousClass5.write(parsedouble, obj);
                }
            }));
            return new write(this.$write);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(parseDouble parsedouble, Object obj) {
            ((getAnswerMap) parsedouble.getRemoteActionCompatParcelizer()).invoke(obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(onSkipToPrevious<I> onskiptoprevious, r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0, String str, accessaddObserverForBackInvoker<I, O> accessaddobserverforbackinvoker, parseDouble<? extends getAnswerMap<? super O, getShowPopup>> parsedouble) {
            super(1);
            this.$write = onskiptoprevious;
            this.$IconCompatParcelizer = r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0;
            this.$AudioAttributesCompatParcelizer = str;
            this.$RemoteActionCompatParcelizer = accessaddobserverforbackinvoker;
            this.$read = parsedouble;
        }
    }

    public static final <I, O> r8lambdaKUbBm7ckfqTc9QCgukC86fguu4<I, O> read(accessaddObserverForBackInvoker<I, O> accessaddobserverforbackinvoker, getAnswerMap<? super O, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        _handleunrecognizedcharacterescape.read(-1408504823);
        parseDouble parsedouble = _qbuf.read(accessaddobserverforbackinvoker, _handleunrecognizedcharacterescape, 0);
        parseDouble parsedouble2 = _qbuf.read(getanswermap, _handleunrecognizedcharacterescape, 0);
        String str = (String) addTimesI.RemoteActionCompatParcelizer(new Object[0], null, null, AnonymousClass1.read, _handleunrecognizedcharacterescape, 3072, 6);
        PlaybackStateCompat playbackStateCompat = PlaybackStateCompat.INSTANCE;
        _init_lambda3 _init_lambda3VarRemoteActionCompatParcelizer = PlaybackStateCompat.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape);
        if (_init_lambda3VarRemoteActionCompatParcelizer == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 activityResultRegistry = _init_lambda3VarRemoteActionCompatParcelizer.getActivityResultRegistry();
        _handleunrecognizedcharacterescape.read(-1672765924);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new onSkipToPrevious();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        onSkipToPrevious onskiptoprevious = (onSkipToPrevious) objOnPause;
        _handleunrecognizedcharacterescape.RatingCompat();
        _handleunrecognizedcharacterescape.read(-1672765850);
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new r8lambdaKUbBm7ckfqTc9QCgukC86fguu4(onskiptoprevious, parsedouble);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4<I, O> r8lambdakubbm7ckfqtc9qcgukc86fguu4 = (r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) objOnPause2;
        _handleunrecognizedcharacterescape.RatingCompat();
        _handleunrecognizedcharacterescape.read(-1672765582);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(onskiptoprevious);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(activityResultRegistry);
        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
        boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(accessaddobserverforbackinvoker);
        boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(parsedouble2);
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3 | zAudioAttributesCompatParcelizer4 | zAudioAttributesCompatParcelizer5) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = (getAnswerMap) new AnonymousClass5(onskiptoprevious, activityResultRegistry, str, accessaddobserverforbackinvoker, parsedouble2);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        StreamReadException.read(activityResultRegistry, str, accessaddobserverforbackinvoker, (getAnswerMap) objOnPause3, _handleunrecognizedcharacterescape, 0);
        _handleunrecognizedcharacterescape.RatingCompat();
        return r8lambdakubbm7ckfqtc9qcgukc86fguu4;
    }

    /* JADX INFO: renamed from: o.setSessionImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "", "write", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<String> {
        public static final AnonymousClass1 read = new AnonymousClass1();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return UUID.randomUUID().toString();
        }

        AnonymousClass1() {
            super(0);
        }
    }
}
