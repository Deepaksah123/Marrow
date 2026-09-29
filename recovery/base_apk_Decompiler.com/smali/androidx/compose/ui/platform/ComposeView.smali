###### Class androidx.compose.ui.platform.ComposeView (androidx.compose.ui.platform.ComposeView)
.class public final Landroidx/compose/ui/platform/ComposeView;
.super Landroidx/compose/ui/platform/AbstractComposeView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\n2\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0016\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R$\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178\u0015@RX\u0094\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b"
    }
    d2 = {
        "Landroidx/compose/ui/platform/ComposeView;",
        "Landroidx/compose/ui/platform/AbstractComposeView;",
        "Landroid/content/Context;",
        "p0",
        "Landroid/util/AttributeSet;",
        "p1",
        "",
        "p2",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "IconCompatParcelizer",
        "(Lo/_handleUnrecognizedCharacterEscape;I)V",
        "",
        "getAccessibilityClassName",
        "()Ljava/lang/CharSequence;",
        "Lkotlin/Function0;",
        "setContent",
        "(Lo/MagicModuleSubmissionRequestBody;)V",
        "Lo/InputAccessor;",
        "AudioAttributesCompatParcelizer",
        "Lo/InputAccessor;",
        "RemoteActionCompatParcelizer",
        "",
        "read",
        "Z",
        "write",
        "()Z"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/InputAccessor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/InputAccessor<",
            "Lo/MagicModuleSubmissionRequestBody<",
            "Lo/_handleUnrecognizedCharacterEscape;",
            "Ljava/lang/Integer;",
            "Lo/getShowPopup;",
            ">;>;"
        }
    .end annotation
.end field

.field private read:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 463
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 9

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 464
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 433
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    const/4 p2, 0x2

    .line 438
    invoke-static {p1, p1, p2, p1}, Lo/_qbuf;->RemoteActionCompatParcelizer$default(Ljava/lang/Object;Lo/quoteAsUTF8;ILjava/lang/Object;)Lo/InputAccessor;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/ComposeView;->AudioAttributesCompatParcelizer:Lo/InputAccessor;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 435
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V
    .registers 8

    const v0, 0x190bf45a

    .line 445
    invoke-interface {p1, v0}, Lo/_handleUnrecognizedCharacterEscape;->write(I)Lo/_handleUnrecognizedCharacterEscape;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_17

    invoke-interface {p1, p0}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, 0x4

    goto :goto_15

    :cond_14
    move v1, v2

    :goto_15
    or-int/2addr v1, p2

    goto :goto_18

    :cond_17
    move v1, p2

    :goto_18
    and-int/lit8 v3, v1, 0x3

    const/4 v4, 0x0

    if-eq v3, v2, :cond_1f

    const/4 v2, 0x1

    goto :goto_20

    :cond_1f
    move v2, v4

    :goto_20
    and-int/lit8 v3, v1, 0x1

    invoke-interface {p1, v2, v3}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v2

    if-eqz v2, :cond_5f

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v2

    if-eqz v2, :cond_34

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:444)"

    invoke-static {v0, v1, v2, v3}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 446
    :cond_34
    iget-object v0, p0, Landroidx/compose/ui/platform/ComposeView;->AudioAttributesCompatParcelizer:Lo/InputAccessor;

    invoke-interface {v0}, Lo/InputAccessor;->read()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/MagicModuleSubmissionRequestBody;

    if-nez v0, :cond_45

    const v0, -0x49d6f281

    invoke-interface {p1, v0}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(I)V

    goto :goto_52

    :cond_45
    const v1, 0x5e04ac2

    invoke-interface {p1, v1}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(I)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/MagicModuleSubmissionRequestBody;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_52
    invoke-interface {p1}, Lo/_handleUnrecognizedCharacterEscape;->MediaBrowserCompatCustomActionResultReceiver()V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_62

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_62

    .line 445
    :cond_5f
    invoke-interface {p1}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 447
    :cond_62
    :goto_62
    invoke-interface {p1}, Lo/_handleUnrecognizedCharacterEscape;->MediaBrowserCompatSearchResultReceiver()Lo/releaseNameCopyBuffer;

    move-result-object p1

    if-eqz p1, :cond_72

    new-instance v0, Landroidx/compose/ui/platform/ComposeView$RemoteActionCompatParcelizer;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/platform/ComposeView$RemoteActionCompatParcelizer;-><init>(Landroidx/compose/ui/platform/ComposeView;I)V

    check-cast v0, Lo/MagicModuleSubmissionRequestBody;

    invoke-interface {p1, v0}, Lo/releaseNameCopyBuffer;->read(Lo/MagicModuleSubmissionRequestBody;)V

    :cond_72
    return-void
.end method

.method public final getAccessibilityClassName()Ljava/lang/CharSequence;
    .registers 1

    .line 450
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final setContent(Lo/MagicModuleSubmissionRequestBody;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/MagicModuleSubmissionRequestBody<",
            "-",
            "Lo/_handleUnrecognizedCharacterEscape;",
            "-",
            "Ljava/lang/Integer;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 459
    iput-boolean v0, p0, Landroidx/compose/ui/platform/ComposeView;->read:Z

    .line 460
    iget-object v0, p0, Landroidx/compose/ui/platform/ComposeView;->AudioAttributesCompatParcelizer:Lo/InputAccessor;

    invoke-interface {v0, p1}, Lo/InputAccessor;->write(Ljava/lang/Object;)V

    .line 461
    invoke-virtual {p0}, Landroidx/compose/ui/platform/ComposeView;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_11

    .line 462
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->IconCompatParcelizer()V

    :cond_11
    return-void
.end method

.method protected final write()Z
    .registers 1

    .line 441
    iget-boolean p0, p0, Landroidx/compose/ui/platform/ComposeView;->read:Z

    return p0
.end method

###### Class androidx.compose.ui.platform.ComposeView.RemoteActionCompatParcelizer (androidx.compose.ui.platform.ComposeView$RemoteActionCompatParcelizer)
.class final Landroidx/compose/ui/platform/ComposeView$RemoteActionCompatParcelizer;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/ComposeView;->IconCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/MagicModuleSubmissionRequestBody<",
        "Lo/_handleUnrecognizedCharacterEscape;",
        "Ljava/lang/Integer;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/platform/ComposeView;

.field final synthetic write:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/ComposeView;I)V
    .registers 3

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/ComposeView$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/platform/ComposeView;

    iput p2, p0, Landroidx/compose/ui/platform/ComposeView$RemoteActionCompatParcelizer;->write:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/ComposeView$RemoteActionCompatParcelizer;->read(Lo/_handleUnrecognizedCharacterEscape;I)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read(Lo/_handleUnrecognizedCharacterEscape;I)V
    .registers 3

    .line 3
    iget-object p2, p0, Landroidx/compose/ui/platform/ComposeView$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/platform/ComposeView;

    iget p0, p0, Landroidx/compose/ui/platform/ComposeView$RemoteActionCompatParcelizer;->write:I

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lo/_appendEscaped;->RemoteActionCompatParcelizer(I)I

    move-result p0

    invoke-virtual {p2, p1, p0}, Landroidx/compose/ui/platform/AbstractComposeView;->IconCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V

    return-void
.end method
