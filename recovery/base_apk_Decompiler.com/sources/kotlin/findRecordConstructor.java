package kotlin;

import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class findRecordConstructor {
    public static final <VM extends POJOPropertyBuilderWithMember> VM RemoteActionCompatParcelizer(isHdPlaybackError<VM> ishdplaybackerror, TypeResolutionContext typeResolutionContext, String str, VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer, withFieldVisibility withfieldvisibility, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1673618944, i, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
        }
        VM vm = (VM) JDK14UtilRawTypeName.write(typeResolutionContext, ishdplaybackerror, str, null, withfieldvisibility);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return vm;
    }

    public static final <VM extends POJOPropertyBuilderWithMember> VM AudioAttributesCompatParcelizer(TypeResolutionContext typeResolutionContext, isHdPlaybackError<VM> ishdplaybackerror, String str, VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer, withFieldVisibility withfieldvisibility) {
        VisibilityChecker visibilityCheckerIconCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            VisibilityChecker.Companion companion = VisibilityChecker.INSTANCE;
            visibilityCheckerIconCompatParcelizer = VisibilityChecker.Companion.read(typeResolutionContext.getViewModelStore(), remoteActionCompatParcelizer, withfieldvisibility);
        } else if (typeResolutionContext instanceof anyExplicitsWithoutIgnoral) {
            VisibilityChecker.Companion companion2 = VisibilityChecker.INSTANCE;
            visibilityCheckerIconCompatParcelizer = VisibilityChecker.Companion.read(typeResolutionContext.getViewModelStore(), ((anyExplicitsWithoutIgnoral) typeResolutionContext).getDefaultViewModelProviderFactory(), withfieldvisibility);
        } else {
            VisibilityChecker.Companion companion3 = VisibilityChecker.INSTANCE;
            visibilityCheckerIconCompatParcelizer = VisibilityChecker.Companion.IconCompatParcelizer(typeResolutionContext, null, null, 6);
        }
        if (str != null) {
            return (VM) visibilityCheckerIconCompatParcelizer.write(str, ishdplaybackerror);
        }
        return (VM) visibilityCheckerIconCompatParcelizer.RemoteActionCompatParcelizer(ishdplaybackerror);
    }
}
