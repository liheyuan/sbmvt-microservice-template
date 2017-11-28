/**
 * @(#)ExportAudioJob.java, Jul 14, 2017.
 * <p>
 * Copyright 2017 coder4.com. All rights reserved.
 * CODER4.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package @packageName@.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author coder4 
 */
@ConditionalOnProperty(value = "jobs.active", havingValue = "@CamelName@Job")
@Service
public class @CamelName@Job implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(@CamelName@Job.class);

    @Value("${dryRun:#{false}}")
    private boolean dryRun;

    @Override
    public void run(String... args) throws Exception {
        LOG.info("job started @CamelName@Job");

        LOG.info("job ended @CamelName@Job");
        System.exit(0);
    }

}
