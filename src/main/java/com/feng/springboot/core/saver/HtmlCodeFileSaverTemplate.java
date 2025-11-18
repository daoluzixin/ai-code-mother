package com.feng.springboot.core.saver;

import cn.hutool.core.util.StrUtil;
import com.feng.springboot.ai.model.HtmlCodeResult;
import com.feng.springboot.common.ErrorCode;
import com.feng.springboot.exception.BusinessException;
import com.feng.springboot.model.enums.CodeGenTypeEnum;

/**
 * HTML代码文件保存器
 *
 * @author yupi
 */
public class HtmlCodeFileSaverTemplate extends CodeFileSaverTemplate<HtmlCodeResult> {

    @Override
    public CodeGenTypeEnum getCodeGenType() {
        return CodeGenTypeEnum.HTML;


    }

    @Override
    protected void saveFiles(HtmlCodeResult result, String baseDirPath) {
        writeToFile(baseDirPath, "index.html", result.getHtmlCode());
    }

    @Override
    protected void validateInput(HtmlCodeResult result) {
        super.validateInput(result);
        // HTML 代码不能为空
        if (StrUtil.isBlank(result.getHtmlCode())) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "HTML 代码不能为空");
        }
    }
}
