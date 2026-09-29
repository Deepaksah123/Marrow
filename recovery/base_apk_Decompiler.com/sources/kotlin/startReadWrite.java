package kotlin;

import com.marrow.data.models.common.Editor;

/* JADX INFO: loaded from: classes3.dex */
public final class startReadWrite {
    public static final removeSpan write(Editor editor) {
        toMagicModuleMetaRepoModel.write(editor, "");
        String displayname = editor.getDisplayname();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(displayname, "");
        String designation = editor.getDesignation();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(designation, "");
        String videoIntro = editor.getVideoIntro();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(videoIntro, "");
        return new removeSpan(displayname, designation, videoIntro);
    }
}
