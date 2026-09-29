###### Class androidx.media3.ui.SubtitleView (androidx.media3.ui.SubtitleView)
.class public final Landroidx/media3/ui/SubtitleView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:F

.field private AudioAttributesImplApi21Parcelizer:Landroid/view/View;

.field private AudioAttributesImplApi26Parcelizer:Lo/computeNext;

.field private AudioAttributesImplBaseParcelizer:Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:I

.field private MediaBrowserCompatItemReceiver:I

.field private RemoteActionCompatParcelizer:F

.field private read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/getDefaultImpl;",
            ">;"
        }
    .end annotation
.end field

.field private write:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 133
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/SubtitleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 137
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 138
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Landroidx/media3/ui/SubtitleView;->read:Ljava/util/List;

    .line 139
    sget-object p2, Lo/computeNext;->IconCompatParcelizer:Lo/computeNext;

    iput-object p2, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplApi26Parcelizer:Lo/computeNext;

    const/4 p2, 0x0

    .line 140
    iput p2, p0, Landroidx/media3/ui/SubtitleView;->MediaBrowserCompatItemReceiver:I

    const p2, 0x3d5a511a    # 0.0533f

    .line 141
    iput p2, p0, Landroidx/media3/ui/SubtitleView;->RemoteActionCompatParcelizer:F

    const p2, 0x3da3d70a    # 0.08f

    .line 142
    iput p2, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesCompatParcelizer:F

    const/4 p2, 0x1

    .line 143
    iput-boolean p2, p0, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer:Z

    .line 144
    iput-boolean p2, p0, Landroidx/media3/ui/SubtitleView;->write:Z

    .line 146
    new-instance v0, Landroidx/media3/ui/CanvasSubtitleOutput;

    invoke-direct {v0, p1}, Landroidx/media3/ui/CanvasSubtitleOutput;-><init>(Landroid/content/Context;)V

    .line 147
    iput-object v0, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplBaseParcelizer:Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;

    .line 148
    iput-object v0, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    .line 149
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    iput p2, p0, Landroidx/media3/ui/SubtitleView;->MediaBrowserCompatCustomActionResultReceiver:I

    return-void
.end method

.method private AudioAttributesCompatParcelizer()Lo/computeNext;
    .registers 2

    .line 333
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 334
    sget-object p0, Lo/computeNext;->IconCompatParcelizer:Lo/computeNext;

    return-object p0

    .line 338
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "captioning"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/accessibility/CaptioningManager;

    if-eqz p0, :cond_26

    .line 339
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_26

    .line 340
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->getUserStyle()Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    move-result-object p0

    invoke-static {p0}, Lo/computeNext;->RemoteActionCompatParcelizer(Landroid/view/accessibility/CaptioningManager$CaptionStyle;)Lo/computeNext;

    move-result-object p0

    return-object p0

    .line 341
    :cond_26
    sget-object p0, Lo/computeNext;->IconCompatParcelizer:Lo/computeNext;

    return-object p0
.end method

.method private IconCompatParcelizer()V
    .registers 7

    .line 345
    iget-object v0, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplBaseParcelizer:Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;

    .line 346
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->write()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplApi26Parcelizer:Lo/computeNext;

    iget v3, p0, Landroidx/media3/ui/SubtitleView;->RemoteActionCompatParcelizer:F

    iget v4, p0, Landroidx/media3/ui/SubtitleView;->MediaBrowserCompatItemReceiver:I

    iget v5, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesCompatParcelizer:F

    .line 345
    invoke-interface/range {v0 .. v5}, Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;->write(Ljava/util/List;Lo/computeNext;FIF)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ":",
            "Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;",
            ">(TT;)V"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 190
    iget-object v0, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    instance-of v1, v0, Landroidx/media3/ui/WebViewSubtitleOutput;

    if-eqz v1, :cond_10

    .line 191
    check-cast v0, Landroidx/media3/ui/WebViewSubtitleOutput;

    invoke-virtual {v0}, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer()V

    .line 193
    :cond_10
    iput-object p1, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplApi21Parcelizer:Landroid/view/View;

    .line 194
    move-object v0, p1

    check-cast v0, Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;

    iput-object v0, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplBaseParcelizer:Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;

    .line 195
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()F
    .registers 3

    .line 321
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_9

    return v1

    .line 326
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "captioning"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/accessibility/CaptioningManager;

    if-eqz p0, :cond_22

    .line 327
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_22

    .line 328
    invoke-virtual {p0}, Landroid/view/accessibility/CaptioningManager;->getFontScale()F

    move-result p0

    return p0

    :cond_22
    return v1
.end method

.method private RemoteActionCompatParcelizer(Lo/getDefaultImpl;)Lo/getDefaultImpl;
    .registers 3

    .line 377
    invoke-virtual {p1}, Lo/getDefaultImpl;->AudioAttributesCompatParcelizer()Lo/getDefaultImpl$write;

    move-result-object p1

    .line 378
    iget-boolean v0, p0, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer:Z

    if-nez v0, :cond_c

    .line 379
    invoke-static {p1}, Lo/PrivateMaxEntriesMapKeySet;->RemoteActionCompatParcelizer(Lo/getDefaultImpl$write;)V

    goto :goto_13

    .line 380
    :cond_c
    iget-boolean p0, p0, Landroidx/media3/ui/SubtitleView;->write:Z

    if-nez p0, :cond_13

    .line 381
    invoke-static {p1}, Lo/PrivateMaxEntriesMapKeySet;->AudioAttributesCompatParcelizer(Lo/getDefaultImpl$write;)V

    .line 383
    :cond_13
    :goto_13
    invoke-virtual {p1}, Lo/getDefaultImpl$write;->write()Lo/getDefaultImpl;

    move-result-object p0

    return-object p0
.end method

.method private read(IF)V
    .registers 3

    .line 259
    iput p1, p0, Landroidx/media3/ui/SubtitleView;->MediaBrowserCompatItemReceiver:I

    .line 260
    iput p2, p0, Landroidx/media3/ui/SubtitleView;->RemoteActionCompatParcelizer:F

    .line 261
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer()V

    return-void
.end method

.method private write()Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo/getDefaultImpl;",
            ">;"
        }
    .end annotation

    .line 366
    iget-boolean v0, p0, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Landroidx/media3/ui/SubtitleView;->write:Z

    if-eqz v0, :cond_b

    .line 367
    iget-object p0, p0, Landroidx/media3/ui/SubtitleView;->read:Ljava/util/List;

    return-object p0

    .line 369
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/media3/ui/SubtitleView;->read:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 370
    :goto_17
    iget-object v2, p0, Landroidx/media3/ui/SubtitleView;->read:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_31

    .line 371
    iget-object v2, p0, Landroidx/media3/ui/SubtitleView;->read:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/getDefaultImpl;

    invoke-direct {p0, v2}, Landroidx/media3/ui/SubtitleView;->RemoteActionCompatParcelizer(Lo/getDefaultImpl;)Lo/getDefaultImpl;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_17

    :cond_31
    return-object v0
.end method


# virtual methods
.method public final setApplyEmbeddedFontSizes(Z)V
    .registers 2

    .line 282
    iput-boolean p1, p0, Landroidx/media3/ui/SubtitleView;->write:Z

    .line 283
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer()V

    return-void
.end method

.method public final setApplyEmbeddedStyles(Z)V
    .registers 2

    .line 271
    iput-boolean p1, p0, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer:Z

    .line 272
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer()V

    return-void
.end method

.method public final setBottomPaddingFraction(F)V
    .registers 2

    .line 316
    iput p1, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesCompatParcelizer:F

    .line 317
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer()V

    return-void
.end method

.method public final setCues(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/getDefaultImpl;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_6

    .line 159
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_6
    iput-object p1, p0, Landroidx/media3/ui/SubtitleView;->read:Ljava/util/List;

    .line 160
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer()V

    return-void
.end method

.method public final setFixedTextSize(IF)V
    .registers 4

    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_b

    .line 210
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    goto :goto_f

    .line 212
    :cond_b
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 216
    :goto_f
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/4 p2, 0x2

    .line 214
    invoke-direct {p0, p2, p1}, Landroidx/media3/ui/SubtitleView;->read(IF)V

    return-void
.end method

.method public final setFractionalTextSize(F)V
    .registers 3

    const/4 v0, 0x0

    .line 238
    invoke-virtual {p0, p1, v0}, Landroidx/media3/ui/SubtitleView;->setFractionalTextSize(FZ)V

    return-void
.end method

.method public final setFractionalTextSize(FZ)V
    .registers 3

    .line 251
    invoke-direct {p0, p2, p1}, Landroidx/media3/ui/SubtitleView;->read(IF)V

    return-void
.end method

.method public final setStyle(Lo/computeNext;)V
    .registers 2

    .line 302
    iput-object p1, p0, Landroidx/media3/ui/SubtitleView;->AudioAttributesImplApi26Parcelizer:Lo/computeNext;

    .line 303
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer()V

    return-void
.end method

.method public final setUserDefaultStyle()V
    .registers 2

    .line 293
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->AudioAttributesCompatParcelizer()Lo/computeNext;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/media3/ui/SubtitleView;->setStyle(Lo/computeNext;)V

    return-void
.end method

.method public final setUserDefaultTextSize()V
    .registers 3

    .line 226
    invoke-direct {p0}, Landroidx/media3/ui/SubtitleView;->RemoteActionCompatParcelizer()F

    move-result v0

    const v1, 0x3d5a511a    # 0.0533f

    mul-float/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/media3/ui/SubtitleView;->setFractionalTextSize(F)V

    return-void
.end method

.method public final setViewType(I)V
    .registers 4

    .line 172
    iget v0, p0, Landroidx/media3/ui/SubtitleView;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    if-eq p1, v0, :cond_1e

    const/4 v0, 0x2

    if-ne p1, v0, :cond_18

    .line 180
    new-instance v0, Landroidx/media3/ui/WebViewSubtitleOutput;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/media3/ui/WebViewSubtitleOutput;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer(Landroid/view/View;)V

    goto :goto_2a

    .line 183
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 177
    :cond_1e
    new-instance v0, Landroidx/media3/ui/CanvasSubtitleOutput;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/media3/ui/CanvasSubtitleOutput;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroidx/media3/ui/SubtitleView;->IconCompatParcelizer(Landroid/view/View;)V

    .line 185
    :goto_2a
    iput p1, p0, Landroidx/media3/ui/SubtitleView;->MediaBrowserCompatCustomActionResultReceiver:I

    return-void
.end method

###### Class androidx.media3.ui.SubtitleView.IconCompatParcelizer (androidx.media3.ui.SubtitleView$IconCompatParcelizer)
.class interface abstract Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/SubtitleView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract write(Ljava/util/List;Lo/computeNext;FIF)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/getDefaultImpl;",
            ">;",
            "Lo/computeNext;",
            "FIF)V"
        }
    .end annotation
.end method
