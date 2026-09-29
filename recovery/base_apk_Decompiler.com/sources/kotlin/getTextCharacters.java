package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lo/getParsingContext;", "Lo/TreeNode;", "p0", "Lo/SwitchCompat;", "write", "(Lo/getParsingContext;Lo/TreeNode;)Lo/SwitchCompat;", "AudioAttributesCompatParcelizer", "(Lo/TreeNode;Lo/_handleUnrecognizedCharacterEscape;I)Lo/SwitchCompat;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getTextCharacters {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[TreeNode.values().length];
            try {
                iArr[TreeNode.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TreeNode.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TreeNode.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TreeNode.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TreeNode.RemoteActionCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TreeNode.read.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final <T> SwitchCompat<T> write(getParsingContext getparsingcontext, TreeNode treeNode) {
        switch (WhenMappings.RemoteActionCompatParcelizer[treeNode.ordinal()]) {
            case 1:
                return getparsingcontext.write();
            case 2:
                return getparsingcontext.IconCompatParcelizer();
            case 3:
                return getparsingcontext.AudioAttributesImplApi21Parcelizer();
            case 4:
                return getparsingcontext.AudioAttributesCompatParcelizer();
            case 5:
                return getparsingcontext.RemoteActionCompatParcelizer();
            case 6:
                return getparsingcontext.read();
            default:
                throw new RenewEligibleCreator();
        }
    }

    public static final <T> SwitchCompat<T> AudioAttributesCompatParcelizer(TreeNode treeNode, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-19828261, i, -1, "androidx.compose.material3.value (MotionScheme.kt:288)");
        }
        SwitchCompat<T> switchCompatWrite = write(getCurrentName.INSTANCE.read(_handleunrecognizedcharacterescape, 6), treeNode);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return switchCompatWrite;
    }
}
