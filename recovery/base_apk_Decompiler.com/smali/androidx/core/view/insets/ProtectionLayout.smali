###### Class androidx.core.view.insets.ProtectionLayout (androidx.core.view.insets.ProtectionLayout)
.class public Landroidx/core/view/insets/ProtectionLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field private static final read:Ljava/lang/Object;


# instance fields
.field private final RemoteActionCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/getAnnotated;",
            ">;"
        }
    .end annotation
.end field

.field private write:Lo/getRawType;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 66
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/core/view/insets/ProtectionLayout;->read:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 71
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 67
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/core/view/insets/ProtectionLayout;->RemoteActionCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 75
    invoke-direct {p0, p1, p2, v0}, Landroidx/core/view/insets/ProtectionLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const/4 v0, 0x0

    .line 80
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/core/view/insets/ProtectionLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IB)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IB)V
    .registers 5

    const/4 p4, 0x0

    .line 85
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 67
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/core/view/insets/ProtectionLayout;->RemoteActionCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 5

    .line 179
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    if-eqz v0, :cond_39

    .line 180
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    invoke-virtual {v1}, Lo/getRawType;->IconCompatParcelizer()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    invoke-virtual {v1}, Lo/getRawType;->IconCompatParcelizer()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->removeViews(II)V

    .line 181
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    invoke-virtual {v0}, Lo/getRawType;->IconCompatParcelizer()I

    move-result v0

    const/4 v1, 0x0

    :goto_1f
    const/4 v2, 0x0

    if-ge v1, v0, :cond_32

    .line 182
    iget-object v3, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    invoke-virtual {v3, v1}, Lo/getRawType;->write(I)Lo/getAnnotated;

    move-result-object v3

    invoke-virtual {v3}, Lo/getAnnotated;->RemoteActionCompatParcelizer()Lo/getAnnotated$IconCompatParcelizer;

    move-result-object v3

    invoke-virtual {v3, v2}, Lo/getAnnotated$IconCompatParcelizer;->read(Lo/getAnnotated$IconCompatParcelizer$read;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1f

    .line 184
    :cond_32
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    invoke-virtual {v0}, Lo/getRawType;->write()V

    .line 185
    iput-object v2, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    :cond_39
    return-void
.end method

.method private IconCompatParcelizer()Lo/of;
    .registers 3

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    .line 119
    sget v0, Lo/_byteOverflow$IconCompatParcelizer;->tag_system_bar_state_monitor:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    .line 120
    instance-of v1, v0, Lo/of;

    if-eqz v1, :cond_13

    .line 121
    check-cast v0, Lo/of;

    return-object v0

    .line 123
    :cond_13
    new-instance v0, Lo/of;

    invoke-direct {v0, p0}, Lo/of;-><init>(Landroid/view/ViewGroup;)V

    .line 124
    sget v1, Lo/_byteOverflow$IconCompatParcelizer;->tag_system_bar_state_monitor:I

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object v0
.end method

.method private IconCompatParcelizer(Landroid/content/Context;ILo/getAnnotated;)V
    .registers 10

    .line 193
    invoke-virtual {p3}, Lo/getAnnotated;->RemoteActionCompatParcelizer()Lo/getAnnotated$IconCompatParcelizer;

    move-result-object v0

    .line 194
    invoke-virtual {p3}, Lo/getAnnotated;->write()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x4

    const/4 v4, -0x1

    if-eq v1, v2, :cond_42

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3b

    if-eq v1, v3, :cond_35

    const/16 v2, 0x8

    if-ne v1, v2, :cond_1d

    .line 212
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->read()I

    move-result p3

    const/16 v1, 0x50

    goto :goto_4a

    .line 216
    :cond_1d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unexpected side: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lo/getAnnotated;->write()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 206
    :cond_35
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer()I

    move-result p3

    const/4 v1, 0x5

    goto :goto_47

    .line 202
    :cond_3b
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->read()I

    move-result p3

    const/16 v1, 0x30

    goto :goto_4a

    .line 196
    :cond_42
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer()I

    move-result p3

    const/4 v1, 0x3

    :goto_47
    move v5, v4

    move v4, p3

    move p3, v5

    .line 219
    :goto_4a
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v4, p3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 221
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->RemoteActionCompatParcelizer()Lo/_verifyEndArrayForSingle;

    move-result-object p3

    .line 222
    iget v1, p3, Lo/_verifyEndArrayForSingle;->read:I

    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 223
    iget v1, p3, Lo/_verifyEndArrayForSingle;->write:I

    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 224
    iget v1, p3, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 225
    iget p3, p3, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    iput p3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 226
    new-instance p3, Landroid/view/View;

    invoke-direct {p3, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 227
    sget-object p1, Landroidx/core/view/insets/ProtectionLayout;->read:Ljava/lang/Object;

    invoke-virtual {p3, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 228
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->IconCompatParcelizer()F

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 229
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->MediaBrowserCompatItemReceiver()F

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 230
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->AudioAttributesCompatParcelizer()F

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setAlpha(F)V

    .line 231
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer()Z

    move-result p1

    if-eqz p1, :cond_89

    const/4 v3, 0x0

    :cond_89
    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    .line 232
    invoke-virtual {v0}, Lo/getAnnotated$IconCompatParcelizer;->write()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 233
    new-instance p1, Landroidx/core/view/insets/ProtectionLayout$5;

    invoke-direct {p1, p0, v2, p3}, Landroidx/core/view/insets/ProtectionLayout$5;-><init>(Landroidx/core/view/insets/ProtectionLayout;Landroid/widget/FrameLayout$LayoutParams;Landroid/view/View;)V

    .line 282
    invoke-virtual {v0, p1}, Lo/getAnnotated$IconCompatParcelizer;->read(Lo/getAnnotated$IconCompatParcelizer$read;)V

    .line 283
    invoke-virtual {p0, p3, p2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 3

    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    .line 130
    sget v0, Lo/_byteOverflow$IconCompatParcelizer;->tag_system_bar_state_monitor:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    .line 131
    instance-of v1, v0, Lo/of;

    if-eqz v1, :cond_22

    .line 135
    check-cast v0, Lo/of;

    .line 136
    invoke-virtual {v0}, Lo/of;->AudioAttributesCompatParcelizer()Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_22

    .line 140
    :cond_19
    invoke-virtual {v0}, Lo/of;->IconCompatParcelizer()V

    .line 141
    sget v0, Lo/_byteOverflow$IconCompatParcelizer;->tag_system_bar_state_monitor:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_22
    :goto_22
    return-void
.end method

.method private write()V
    .registers 7

    .line 165
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_34

    .line 168
    invoke-direct {p0}, Landroidx/core/view/insets/ProtectionLayout;->IconCompatParcelizer()Lo/of;

    move-result-object v0

    .line 169
    new-instance v1, Lo/getRawType;

    iget-object v2, p0, Landroidx/core/view/insets/ProtectionLayout;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-direct {v1, v0, v2}, Lo/getRawType;-><init>(Lo/of;Ljava/util/List;)V

    iput-object v1, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    .line 170
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 171
    iget-object v1, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    invoke-virtual {v1}, Lo/getRawType;->IconCompatParcelizer()I

    move-result v1

    const/4 v2, 0x0

    :goto_20
    if-ge v2, v1, :cond_34

    .line 172
    iget-object v3, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    invoke-virtual {v3, v2}, Lo/getRawType;->write(I)Lo/getAnnotated;

    move-result-object v3

    .line 174
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    add-int v5, v2, v0

    invoke-direct {p0, v4, v5, v3}, Landroidx/core/view/insets/ProtectionLayout;->IconCompatParcelizer(Landroid/content/Context;ILo/getAnnotated;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_20

    :cond_34
    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 6

    if-eqz p1, :cond_1e

    .line 288
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Landroidx/core/view/insets/ProtectionLayout;->read:Ljava/lang/Object;

    if-eq v0, v1, :cond_1e

    .line 290
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Lo/getRawType;->IconCompatParcelizer()I

    move-result v0

    goto :goto_14

    :cond_13
    const/4 v0, 0x0

    .line 291
    :goto_14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int/2addr v1, v0

    if-gt p2, v1, :cond_1d

    if-gez p2, :cond_1e

    :cond_1d
    move p2, v1

    .line 296
    :cond_1e
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 2

    .line 146
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 147
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->write:Lo/getRawType;

    if-eqz v0, :cond_a

    .line 151
    invoke-direct {p0}, Landroidx/core/view/insets/ProtectionLayout;->AudioAttributesCompatParcelizer()V

    .line 153
    :cond_a
    invoke-direct {p0}, Landroidx/core/view/insets/ProtectionLayout;->write()V

    .line 154
    invoke-virtual {p0}, Landroidx/core/view/insets/ProtectionLayout;->requestApplyInsets()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 1

    .line 159
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 160
    invoke-direct {p0}, Landroidx/core/view/insets/ProtectionLayout;->AudioAttributesCompatParcelizer()V

    .line 161
    invoke-direct {p0}, Landroidx/core/view/insets/ProtectionLayout;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public setProtections(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/getAnnotated;",
            ">;)V"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 108
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 109
    invoke-virtual {p0}, Landroidx/core/view/insets/ProtectionLayout;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_19

    .line 110
    invoke-direct {p0}, Landroidx/core/view/insets/ProtectionLayout;->AudioAttributesCompatParcelizer()V

    .line 111
    invoke-direct {p0}, Landroidx/core/view/insets/ProtectionLayout;->write()V

    .line 112
    invoke-virtual {p0}, Landroidx/core/view/insets/ProtectionLayout;->requestApplyInsets()V

    :cond_19
    return-void
.end method

###### Class androidx.core.view.insets.ProtectionLayout.AnonymousClass5 (androidx.core.view.insets.ProtectionLayout$5)
.class final Landroidx/core/view/insets/ProtectionLayout$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getAnnotated$IconCompatParcelizer$read;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/insets/ProtectionLayout;->IconCompatParcelizer(Landroid/content/Context;ILo/getAnnotated;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/core/view/insets/ProtectionLayout;

.field final synthetic RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

.field final synthetic read:Landroid/view/View;


# direct methods
.method constructor <init>(Landroidx/core/view/insets/ProtectionLayout;Landroid/widget/FrameLayout$LayoutParams;Landroid/view/View;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 234
    iput-object p1, p0, Landroidx/core/view/insets/ProtectionLayout$5;->AudioAttributesCompatParcelizer:Landroidx/core/view/insets/ProtectionLayout;

    iput-object p2, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    iput-object p3, p0, Landroidx/core/view/insets/ProtectionLayout$5;->read:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(F)V
    .registers 2

    .line 274
    iget-object p0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->read:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final IconCompatParcelizer(I)V
    .registers 3

    .line 238
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 239
    iget-object p1, p0, Landroidx/core/view/insets/ProtectionLayout$5;->read:Landroid/view/View;

    iget-object p0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)V
    .registers 3

    .line 244
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 245
    iget-object p1, p0, Landroidx/core/view/insets/ProtectionLayout$5;->read:Landroid/view/View;

    iget-object p0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Z)V
    .registers 2

    .line 259
    iget-object p0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->read:Landroid/view/View;

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    goto :goto_7

    :cond_6
    const/4 p1, 0x4

    :goto_7
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final read(F)V
    .registers 2

    .line 279
    iget-object p0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->read:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final read(Lo/_verifyEndArrayForSingle;)V
    .registers 4

    .line 250
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p1, Lo/_verifyEndArrayForSingle;->read:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 251
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p1, Lo/_verifyEndArrayForSingle;->write:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 252
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p1, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 253
    iget-object v0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    iget p1, p1, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 254
    iget-object p1, p0, Landroidx/core/view/insets/ProtectionLayout$5;->read:Landroid/view/View;

    iget-object p0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->RemoteActionCompatParcelizer:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final write(F)V
    .registers 2

    .line 269
    iget-object p0, p0, Landroidx/core/view/insets/ProtectionLayout$5;->read:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method
